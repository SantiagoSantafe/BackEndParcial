package Componentes;


import lombok.*;

import javax.validation.constraints.NotEmpty;
@Getter
@Setter
@AllArgsConstructor
public class Tarea {
    @NotEmpty
    protected String descripcionTarea;
    @NotEmpty
    protected int importanciaTarea;
    protected String fechaRealizacionTarea;
    @NotEmpty
    protected int horasDedicadaTarea;
}
