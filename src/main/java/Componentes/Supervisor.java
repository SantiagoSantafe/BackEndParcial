package Componentes;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
@Getter
@Setter
@AllArgsConstructor
public class Supervisor {
    @NotEmpty
    protected String nombreCompletoSupervisor;
    @NotEmpty
    protected String cargoSupervisor;
    @NotEmpty
    protected int telefonoSupervisor;
}
