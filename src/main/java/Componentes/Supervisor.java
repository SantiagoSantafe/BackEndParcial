package Componentes;


import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("nombreCompletoSupervisor")
    @NotEmpty
    protected String nombreCompletoSupervisor;
    @JsonProperty("cargoSupervisor")
    @NotEmpty
    protected String cargoSupervisor;
    @JsonProperty("telefonoSupervisor")
    @NotEmpty
    protected int telefonoSupervisor;
}
