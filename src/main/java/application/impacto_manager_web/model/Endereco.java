package application.impacto_manager_web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    private String cep;
    private String rua;
    private String bairro;
    private String cidade;
    private String numeroCasa;
    private String complemento;
}
