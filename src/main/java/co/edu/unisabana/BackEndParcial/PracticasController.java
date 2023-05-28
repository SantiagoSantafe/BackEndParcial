package co.edu.unisabana.BackEndParcial;


import org.springframework.web.bind.annotation.*;

import Componentes.Respuesta;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;


@RestController
public class PracticasController {
    List<Practicas> listaPracticas=new ArrayList<>();

    @GetMapping(path = "/practicas/todas")
    public List<Practicas> listaest() {
        return listaPracticas;
    }

    @PostMapping (path = "/practicas/agregar")
    public Respuesta agregarPractica(@RequestBody @Valid Practicas nuevaPractica){
        nuevaPractica.setId(listaPracticas.size());
        listaPracticas.add(nuevaPractica);
        return new Respuesta("Creado exitosamente") ;
    }
    @DeleteMapping(path = "/practica/eliminar/{id}")
    public Respuesta eliminarPractica(@PathVariable int id){
        for (Practicas practica: listaPracticas){
            if (practica.getId()==id){
                listaPracticas.remove(practica);
            }
        }
        return new Respuesta("Removido exitosamente") ;
    }
}
