package application.impacto_manager_web.service;

import application.impacto_manager_web.exceptions.CustomException;
import application.impacto_manager_web.model.Professor;
import application.impacto_manager_web.model.ProfessorGenerated;
import application.impacto_manager_web.repository.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

import static application.impacto_manager_web.exceptions.ExceptionBuildMessage.errorBuildMessage;

@Service
@RequiredArgsConstructor
public class ProfessorService {
    private final ProfessorRepository repository;

    public List<Professor> findAll() {
        return repository.findAll();
    }

    public Professor findById(Long id) {
        return repository.findById(id).orElseThrow(() ->
            new CustomException(Professor.class).addError(
                errorBuildMessage(ProfessorService.class, id)
            )
        );
    }

    public List<Professor> findByNome(String nome) {
        return repository.findByNome(nome);
    }

    public Professor createProfessor(ProfessorGenerated body) {
        Professor professor = new Professor();
        BeanUtils.copyProperties(body, professor);
        return repository.save(professor);
    }

    public void deleteProfessor(Professor professor) {
        repository.delete(professor);
    }

    public Professor updateProfessor(ProfessorGenerated body) {
        Professor professor = repository.findById(body.getId()).orElseThrow(() ->
            new CustomException(Professor.class).addError(
                errorBuildMessage(ProfessorService.class, body.getId())
            )
        );
        BeanUtils.copyProperties(body, professor, "id");
        return repository.save(professor);
    }
}