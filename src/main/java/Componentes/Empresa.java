package Componentes;
import lombok.*;
import javax.validation.constraints.NotEmpty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@Getter
@Setter
@AllArgsConstructor
public class Empresa {
        //Datos Empresa
        @NotEmpty
        protected String nombreEmpresa;
        @NotEmpty
        protected String sitioWebEmpresa;
        @NotEmpty
        protected String direccionEmpresa;

        @NotEmpty
        protected int numeroTelefonoEmpresa;
        @NotEmpty
        protected String descripcionEmpresa;
}
