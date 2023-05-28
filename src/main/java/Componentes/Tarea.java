package Componentes;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import javax.validation.constraints.NotEmpty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
@JsonSerialize
@Getter
@Setter
@RequiredArgsConstructor
public class Tarea {
    @JsonProperty("descripcionTarea")
    @NotEmpty
    protected String descripcionTarea;
    @JsonProperty("importanciaTarea")
    @NotEmpty
    protected int importanciaTarea;
    @JsonProperty("fechaRealizacionTarea")
    @NotEmpty
    protected String fechaRealizacionTarea;
    @JsonProperty("horasDedicadaTarea")
    @NotEmpty
    protected int horasDedicadaTarea;
}
