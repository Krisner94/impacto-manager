package application.impacto_manager_web.controller;

import application.controller.AlunosApi;
import application.impacto_manager_web.exceptions.CustomException;
import application.impacto_manager_web.exceptions.Error;
import application.impacto_manager_web.mapper.AlunoMapper;
import application.impacto_manager_web.model.Aluno;
import application.impacto_manager_web.model.AlunoGenerated;
import application.impacto_manager_web.service.AlunoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@Tag(name = "Alunos")
@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class AlunoControllerImpl implements AlunosApi {
    private final AlunoService alunoService;

    @Override
    public ResponseEntity<List<AlunoGenerated>> getAllAlunos() {
        return ok(AlunoMapper.INSTANCE.toAlunoGeneratedList(alunoService.findAll()));
    }

    public ResponseEntity<AlunoGenerated> getAlunoByCpf(String cpf) {
        return ok(AlunoMapper.INSTANCE.toAlunoGenerated(alunoService.findByCpf(cpf)));
    }

    @Override
    public ResponseEntity<List<AlunoGenerated>> getAlunoByNome(String nome) {
        List<Aluno> alunos = alunoService.findByNome(nome);
        List<AlunoGenerated> alunoGenerated = AlunoMapper.INSTANCE.toAlunoGeneratedList(alunos);
        return ok(alunoGenerated);
    }

    @Override
    public ResponseEntity<AlunoGenerated> createAluno(AlunoGenerated body) {
        Aluno savedAluno = alunoService.createAluno(body);
        AlunoGenerated alunoGenerated = AlunoMapper.INSTANCE.toAlunoGenerated(savedAluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoGenerated);
    }

    @Override
    public ResponseEntity<AlunoGenerated> updateAluno(AlunoGenerated body) {
        Aluno updatedAluno = alunoService.update(AlunoMapper.INSTANCE.toAluno(body));
        AlunoGenerated alunoGenerated = AlunoMapper.INSTANCE.toAlunoGenerated(updatedAluno);
        return ResponseEntity.ok(alunoGenerated);
    }

    @Override
    public ResponseEntity<Void> deleteAluno(String id) {
        try{
            Aluno aluno = alunoService.findById(id);
            alunoService.delete(aluno);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            throw new CustomException(Aluno.class).addError(Error.builder()
                    .title("Aluno não encontrado")
                    .message("Aluno com id " + id + " não encontrado")
                    .httpStatus(String.valueOf(HttpStatus.NOT_FOUND.value()))
                .build());
        }
    }
}

