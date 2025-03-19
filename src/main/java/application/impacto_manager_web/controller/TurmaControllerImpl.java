package application.impacto_manager_web.controller;

import application.controller.TurmasApi;
import application.impacto_manager_web.exceptions.CustomException;
import application.impacto_manager_web.exceptions.Error;
import application.impacto_manager_web.mapper.TurmaMapper;
import application.impacto_manager_web.model.Turma;
import application.impacto_manager_web.model.TurmaGenerated;
import application.impacto_manager_web.repository.TurmaRepository;
import application.impacto_manager_web.service.TurmaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/api")
@Tag(name = "Turmas")
@AllArgsConstructor
public class TurmaControllerImpl implements TurmasApi {
    private final TurmaService service;

    @Override
    public ResponseEntity<TurmaGenerated> createTurma(TurmaGenerated body) {
        Turma turma = service.createTurma(body);
        TurmaGenerated turmaGenerated = TurmaMapper.INSTANCE.toTurmaGenerated(turma);
        return ResponseEntity.status(HttpStatus.CREATED).body(turmaGenerated);
    }

    @Override
    public ResponseEntity<Void> deleteTurma(String id) {
        try{
            Turma turma = service.findById(id);
            service.delete(turma);
            return ResponseEntity.noContent().build();
        } catch (Exception e){
            throw new CustomException(Turma.class).addError(
                Error.builder()
                    .title("Turma não encontrada")
                    .message("Turma com id " + id + " não encontrada")
                    .httpStatus(String.valueOf(HttpStatus.NOT_FOUND.value()))
                    .build()
            );
        }
    }

    @Override
    public ResponseEntity<List<TurmaGenerated>> getAllTurmas() {
        return ok(TurmaMapper.INSTANCE.toTurmaGeneratedList(service.findAll()));
    }

    @Override
    public ResponseEntity<TurmaGenerated> getTurmaById(String id) {
        return ok(TurmaMapper.INSTANCE.toTurmaGenerated(service.findById(id)));
    }

    @Override
    public ResponseEntity<TurmaGenerated> updateTurma(TurmaGenerated body) {
        Turma turma = service.update(TurmaMapper.INSTANCE.toTurma(body));
        TurmaGenerated turmaGenerated = TurmaMapper.INSTANCE.toTurmaGenerated(turma);
        return ResponseEntity.ok(turmaGenerated);
    }
}
