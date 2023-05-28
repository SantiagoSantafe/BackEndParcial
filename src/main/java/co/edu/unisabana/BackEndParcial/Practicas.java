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
    @NotNull(message = "No esta el campo")
    protected Empresa empresa;

    @JsonProperty("supervisor")
    @NotNull(message = "No esta el campo")
    protected Supervisor supervisor;

    @JsonProperty("tarea")
    @NotNull(message = "No esta el campo")
    protected Tarea tarea;

}
