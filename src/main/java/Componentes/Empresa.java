package Componentes;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@Getter
@Setter
@RequiredArgsConstructor
public class Empresa {
    // Datos Empresa
    @JsonProperty("nombreEmpresa")
    @NotEmpty
    protected String nombreEmpresa;
    @JsonProperty("sitioWebEmpresa")
    @NotEmpty
    protected String sitioWebEmpresa;
    @JsonProperty("direccionEmpresa")
    @NotEmpty
    protected String direccionEmpresa;
    @JsonProperty("numeroTelefonoEmpresa")
    @NotNull
    protected Integer numeroTelefonoEmpresa;
    @JsonProperty("descripcionEmpresa")
    @NotEmpty
    protected String descripcionEmpresa;
}
