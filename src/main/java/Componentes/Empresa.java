package Componentes;
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
    @NotEmpty
    protected String nombreEmpresa;
    @NotEmpty
    protected String sitioWebEmpresa;
    @NotEmpty
    protected String direccionEmpresa;

    @NotNull
    protected Integer numeroTelefonoEmpresa;
    @NotEmpty
    protected String descripcionEmpresa;
}
