package Componentes;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@Getter
@Setter
@RequiredArgsConstructor
public class Tarea {
    @Size(min = 3, message = "La descripción de la tarea debe tener al menos 3 caracteres")
    @NotEmpty(message = "La descripción de la tarea no puede estar vacía")
    protected String descripcionTarea;
    
    @NotNull(message = "La importancia de la tarea no puede estar vacía")
    protected ImportanciaTareaENUM importanciaTarea;

    @Size(min = 3, message = "La fecha de realización de la tarea debe tener al menos 3 caracteres")
    protected String fechaRealizacionTarea;

    @NotEmpty(message = "Las horas dedicadas a la tarea no pueden estar vacías")
    @Size(min = 1, message = "Las horas dedicadas a la tarea deben ser un valor numérico")
    protected String horasDedicadaTarea;
}
