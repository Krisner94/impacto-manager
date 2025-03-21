package application.impacto_manager_web.controller;

import application.controller.TurmasApi;
import application.impacto_manager_web.mapper.ConvertTo;
import application.impacto_manager_web.model.Turma;
import application.impacto_manager_web.model.TurmaGenerated;
import application.impacto_manager_web.service.TurmaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
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
    public ResponseEntity<List<TurmaGenerated>> getAllTurmas() {
        List<Turma> turmas = service.findAll();
        return ok(ConvertTo.convertToTurmaGeneratedList(turmas));
    }

    @Override
    public ResponseEntity<TurmaGenerated> getTurmaById(Long id) {
        Turma turma = service.findById(id);
        return ok(ConvertTo.convertToTurmaGenerated(turma));
    }

    @Override
    public ResponseEntity<TurmaGenerated> createTurma(TurmaGenerated body) {
        Turma turma = new Turma();
        BeanUtils.copyProperties(body, turma);
        TurmaGenerated generated = ConvertTo.convertToTurmaGenerated(turma);
        return ResponseEntity.status(HttpStatus.CREATED).body(generated);
    }

    @Override
    public ResponseEntity<TurmaGenerated> updateTurma(TurmaGenerated body) {
        Turma turma = service.update(ConvertTo.convertToTurma(body));
        return ok(ConvertTo.convertToTurmaGenerated(turma));
    }

    @Override
    public ResponseEntity<Void> deleteTurma(Long id) {
        Turma turma = service.findById(id);
        service.deleteTurma(turma);
        return ResponseEntity.noContent().build();
    }
}
