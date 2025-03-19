package application.impacto_manager_web.model;

import application.impacto_manager_web.enums.SexoEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"id"})
@Document(collection = "alunos")
public class Aluno {
    @Id
    private String id;
    private String nome;
    private String cpf;
    private SexoEnum sexo;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataNascimento;
    private String telefone;

    private Endereco endereco;
    private List<Responsavel> responsavel;

    @DBRef
    @JsonIgnore
    private List<Turma> turmas;
}