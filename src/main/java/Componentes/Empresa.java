package Componentes;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("nombreEmpresa")
    @Size(min = 3, message = "El nombre de la empresa debe tener al menos 3 caracteres")
    @NotEmpty(message = "El nombre de la empresa no puede estar vacío")
    protected String nombreEmpresa;

    @JsonProperty("sitioWebEmpresa")
    @Size(min = 3, message = "El sitio web de la empresa debe tener al menos 3 caracteres")
    @NotEmpty(message = "El sitio web de la empresa no puede estar vacío")
    protected String sitioWebEmpresa;

    @JsonProperty("direccionEmpresa")
    @Size(min = 3, message = "La dirección de la empresa debe tener al menos 3 caracteres")
    @NotEmpty(message = "La dirección de la empresa no puede estar vacía")
    protected String direccionEmpresa;

    @JsonProperty("numeroTelefonoEmpresa")
    @Size(min = 3, message = "El número de teléfono de la empresa debe tener al menos 3 caracteres")
    @NotEmpty(message = "El número de teléfono de la empresa no puede estar vacío")
    protected String numeroTelefonoEmpresa;

    @JsonProperty("emailEmpresa")
    @Size(min = 3, message = "El email debe tener al menos 3 caracteres")
    @NotEmpty(message = "Se necesita el email de la empresa")
    protected String emailEmpresa;
}
