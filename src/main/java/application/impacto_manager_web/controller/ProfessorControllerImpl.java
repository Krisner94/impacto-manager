package application.impacto_manager_web.controller;

import application.controller.ProfessorApi;
import application.impacto_manager_web.exceptions.CustomException;
import application.impacto_manager_web.exceptions.Error;
import application.impacto_manager_web.mapper.ProfessorMapper;
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
    public ResponseEntity<ProfessorGenerated> createProfessor(ProfessorGenerated body) {
        Professor saveProfessor = service.createProfessor(body);
        ProfessorGenerated professorGenerated = ProfessorMapper.INSTANCE.toProfessorGenerated(saveProfessor);
        return ResponseEntity.status(HttpStatus.CREATED).body(professorGenerated);
    }

    @Override
    public ResponseEntity<Void> deleteProfessor(String id) {
        try{
            Professor professor = service.findById(id);
            service.deleteProfessor(professor);
        } catch (Exception e){
            throw new CustomException(Professor.class).addError(
                Error.builder()
                    .title("Professor não encontrado")
                    .message("O professor com o id " + id + " não foi encontrado")
                    .httpStatus(String.valueOf(HttpStatus.NOT_FOUND.value()))
                    .build()
            );
        }
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<List<ProfessorGenerated>> getAllProfessores() {
        return ok(ProfessorMapper.INSTANCE.toProfessorGeneratedList(service.findAll()));
    }

    @Override
    public ResponseEntity<List<ProfessorGenerated>> getProfessorByNome(String nome) {
        List<ProfessorGenerated> professorGeneratedList = ProfessorMapper.INSTANCE.toProfessorGeneratedList(service.findByNome(nome));
        return ok(professorGeneratedList);
    }


    @Override
    public ResponseEntity<ProfessorGenerated> updateProfessor(ProfessorGenerated body) {
        return ok(ProfessorMapper.INSTANCE.toProfessorGenerated(service.update(ProfessorMapper.INSTANCE.toProfessor(body))));
    }
}