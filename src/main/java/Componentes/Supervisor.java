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
public class Supervisor {
    @Size(min = 3, message = "El nombre del supervisor debe tener al menos 3 caracteres")
    @NotEmpty(message = "El nombre completo del supervisor no puede estar vacío")
    protected String nombreCompletoSupervisor;

    @Size(min = 3, message = "El cargo del supervisor debe de tener al menos 3 caracteres")
    @NotEmpty(message = "El cargo del supervisor no puede estar vacío")
    protected String cargoSupervisor;

    @NotNull(message = "El telefono del supervisor no puede ser nulo")
    protected Integer telefonoSupervisor;
}
