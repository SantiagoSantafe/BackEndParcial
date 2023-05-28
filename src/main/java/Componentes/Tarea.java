package Componentes;


import lombok.*;
import javax.validation.constraints.NotEmpty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
@JsonSerialize
@Getter
@Setter
@RequiredArgsConstructor
public class Tarea {
    @NotEmpty
    protected String descripcionTarea;
    @NotEmpty
    protected int importanciaTarea;
    protected String fechaRealizacionTarea;
    @NotEmpty
    protected int horasDedicadaTarea;
}
