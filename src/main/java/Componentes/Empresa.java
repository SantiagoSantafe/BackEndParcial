package Componentes;

import lombok.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@Getter
@Setter
@RequiredArgsConstructor
public class Empresa {
    // Datos Empresa

    @Size(min = 3, message = "El nombre de la empresa debe tener al menos 3 caracteres")
    @NotEmpty(message = "El nombre de la empresa no puede estar vacío")
    protected String nombreEmpresa;

    @Size(min = 3, message = "El sitio web de la empresa debe tener al menos 3 caracteres")
    @NotEmpty(message = "El sitio web de la empresa no puede estar vacío")
    protected String sitioWebEmpresa;

    @Size(min = 3, message = "La dirección de la empresa debe tener al menos 3 caracteres")
    @NotEmpty(message = "La dirección de la empresa no puede estar vacía")
    protected String direccionEmpresa;

    @Size(min = 3, message = "El número de teléfono de la empresa debe tener al menos 3 caracteres")
    @NotEmpty(message = "El número de teléfono de la empresa no puede estar vacío")
    protected String numeroTelefonoEmpresa;

    @Size(min = 3, message = "La descripción de la empresa debe tener al menos 3 caracteres")
    @NotEmpty(message = "La descripción de la empresa no puede estar vacía")
    protected String descripcionEmpresa;
}
