package application.impacto_manager_web.service;

import application.impacto_manager_web.exceptions.CustomException;
import application.impacto_manager_web.mapper.ProfessorMapper;
import application.impacto_manager_web.model.Professor;
import application.impacto_manager_web.model.ProfessorGenerated;
import application.impacto_manager_web.model.Turma;
import application.impacto_manager_web.repository.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

import static application.impacto_manager_web.exceptions.ExceptionBuildMessage.errorBuildMessage;

@Service
@RequiredArgsConstructor
public class ProfessorService {
    private final ProfessorRepository repository;

    public List<Professor> findAll(){
        return repository.findAll();
    }

    public Professor findById(String id){
        return repository.findById(id);
    }

    public List<Professor> findByNome(String nome){
        return repository.findByNome(nome);
    }

    public Professor createProfessor(ProfessorGenerated body){
        Professor professor = new Professor();
        BeanUtils.copyProperties(body, professor);
        if (body.getTurma() != null){
            List<Turma> turma = Collections.singletonList(new Turma());
            BeanUtils.copyProperties(body.getTurma(), turma);
            professor.setTurmas(turma);
        }
        return repository.save(professor);
    }

    public void deleteProfessor(Professor professor){
        repository.delete(professor);
    }

    public Professor update(Professor professor){
       try{
           Professor newProfessor = repository.findById(professor.getId());
           BeanUtils.copyProperties(professor, newProfessor, "id");
           return repository.save(newProfessor);
       } catch (Exception e){
           throw new CustomException(Professor.class).addError(
               errorBuildMessage(ProfessorMapper.class, professor.getId())
           );
       }
    }
}
