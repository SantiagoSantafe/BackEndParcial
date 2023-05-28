package co.edu.unisabana.BackEndParcial;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import Componentes.Empresa;
import Componentes.Supervisor;
import Componentes.Tarea;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Practicas {
    @JsonProperty("empresa")
    @NotEmpty(message = "Ingrese todos los valores para la empresa")
    @NotNull(message = "No esta el campoo")
    protected Empresa empresa;

    @JsonProperty("supervisor")
    @NotEmpty(message = "Ingrese todos los valores para supervisor")
    @NotNull(message = "No esta el campoo")
    protected Supervisor supervisor;

    @JsonProperty("tarea")
    @NotEmpty(message = "Ingrese todos los valores para supervisor")
    @NotNull(message = "No esta el campoo")
    protected Tarea tarea;

}
