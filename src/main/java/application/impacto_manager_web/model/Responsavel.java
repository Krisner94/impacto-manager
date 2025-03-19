package application.impacto_manager_web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Responsavel {
    private String nome;
    private String parentesco;
    private String telefone;
}
