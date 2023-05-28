package Componentes;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
@JsonSerialize
@Getter
@Setter
@RequiredArgsConstructor
public class Supervisor {
    @NotEmpty
    protected String nombreCompletoSupervisor;
    @NotEmpty
    protected String cargoSupervisor;
    @NotEmpty
    protected int telefonoSupervisor;
}
