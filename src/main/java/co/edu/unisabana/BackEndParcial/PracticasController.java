package co.edu.unisabana.BackEndParcial;


import Componentes.Empresa;
import Componentes.Supervisor;
import Componentes.Tarea;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;
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
    public String agregarPractica(@RequestBody @Valid Practicas nuevaPractica){
        listaPracticas.add(nuevaPractica);
        return "Creado exitosamente";
    }
    @DeleteMapping(path = "/practica/eliminar/{practica}")
    public String eliminarPractica(@PathVariable Practicas practica){
        listaPracticas.remove(practica);
        return "Removido exitosamente";
    }
}
