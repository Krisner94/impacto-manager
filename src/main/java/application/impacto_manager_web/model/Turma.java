package application.impacto_manager_web.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"id"})
@Document(collection = "turmas")
public class Turma implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String nome;
    private List<DiaDeAula> diaDeAula;
    private List<HorarioAula> horarioAula;

    @DBRef
    private List<Aluno> alunos = new ArrayList<>();

    @DBRef
    private List<Professor> professores = new ArrayList<>();
}