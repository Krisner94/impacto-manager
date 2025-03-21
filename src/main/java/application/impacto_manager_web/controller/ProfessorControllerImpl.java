package application.impacto_manager_web.controller;

import application.controller.ProfessorApi;
import application.impacto_manager_web.mapper.ConvertTo;
import application.impacto_manager_web.model.Professor;
import application.impacto_manager_web.model.ProfessorGenerated;
import application.impacto_manager_web.service.ProfessorService;
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
@Tag(name = "Professor")
@AllArgsConstructor
public class ProfessorControllerImpl implements ProfessorApi {
    private final ProfessorService service;

    @Override
    public ResponseEntity<List<ProfessorGenerated>> getAllProfessores() {
        return ok(ConvertTo.convertToProfessorGeneratedList(service.findAll()));
    }

    @Override
    public ResponseEntity<ProfessorGenerated> getProfessorById() {
        Professor professor = new Professor();
        return ok(ConvertTo.convertToProfessorGenerated(professor));
    }

    @Override
    public ResponseEntity<List<ProfessorGenerated>> getProfessorByNome(String nome) {
        List<Professor> professor = service.findByNome(nome);
        return ok(ConvertTo.convertToProfessorGeneratedList(professor));
    }

    @Override
    public ResponseEntity<ProfessorGenerated> createProfessor(ProfessorGenerated body) {
        Professor professor = service.createProfessor(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(ConvertTo.convertToProfessorGenerated(professor));
    }

    @Override
    public ResponseEntity<ProfessorGenerated> updateProfessor(ProfessorGenerated body) {
        Professor professor = service.updateProfessor(body);
        return ok(ConvertTo.convertToProfessorGenerated(professor));
    }

    @Override
    public ResponseEntity<Void> deleteProfessor(Long id) {
        Professor professor = service.findById(id);
        service.deleteProfessor(professor);
        return ResponseEntity.noContent().build();
    }
}