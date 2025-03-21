package application.impacto_manager_web.controller;

import application.controller.AlunosApi;
import application.impacto_manager_web.mapper.ConvertTo;
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
    private final AlunoService service;

    @Override
    public ResponseEntity<AlunoGenerated> createAluno(AlunoGenerated body) {
        Aluno aluno = service.createAluno(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(ConvertTo.convertToAlunoGenerated(aluno));
    }

    @Override
    public ResponseEntity<AlunoGenerated> getAlunoById(Long id) {
        Aluno aluno = new Aluno();
        return ok(ConvertTo.convertToAlunoGenerated(aluno));
    }

    @Override
    public ResponseEntity<List<AlunoGenerated>> getAllAlunos() {
        return ok(ConvertTo.convertToAlunoGeneratedList(service.findAll()));
    }

    @Override
    public ResponseEntity<List<AlunoGenerated>> getAlunoByNome(String nome) {
        List<Aluno> aluno = service.findByNome(nome);
        return ok(ConvertTo.convertToAlunoGeneratedList(aluno));
    }

    @Override
    public ResponseEntity<List<AlunoGenerated>> getAlunoByCpf(String cpf) {
        List<Aluno> aluno = service.findByCpf(cpf);
        return ok(ConvertTo.convertToAlunoGeneratedList(aluno));
    }

    @Override
    public ResponseEntity<AlunoGenerated> updateAluno(AlunoGenerated body) {
        Aluno aluno = service.update(ConvertTo.convertToAluno(body));
        return ok(ConvertTo.convertToAlunoGenerated(aluno));
    }

    @Override
    public ResponseEntity<Void> deleteAluno(Long id) {
        Aluno aluno = service.findById(id);
        service.delete(aluno);
        return ResponseEntity.noContent().build();
    }
}

