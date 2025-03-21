package application.impacto_manager_web.service;

import application.impacto_manager_web.exceptions.CustomException;
import application.impacto_manager_web.model.Aluno;
import application.impacto_manager_web.model.AlunoGenerated;
import application.impacto_manager_web.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

import static application.impacto_manager_web.exceptions.ExceptionBuildMessage.errorBuildMessage;

@Service
@AllArgsConstructor
public class AlunoService {
    private final AlunoRepository repository;

    public List<Aluno> findAll() {
        return repository.findAll();
    }

    public List<Aluno> findByCpf(String cpf) {
        return repository.findByCpf(cpf);
    }

    public List<Aluno> findByNome(String name) {
        return repository.findByNome(name);
    }

    public Aluno findById(Long id) {
        return repository.findById(id).orElseThrow(() ->
            new CustomException(Aluno.class).addError(errorBuildMessage(Aluno.class, id))
        );
    }

    public Aluno createAluno(AlunoGenerated body) {
        Aluno aluno = new Aluno();
        BeanUtils.copyProperties(body, aluno);
        return repository.save(aluno);
    }

    public void delete(Aluno aluno) {

        repository.delete(aluno);
    }

    public Aluno update(Aluno aluno) {
        try {
            Aluno newAluno = repository.findById(aluno.getId()).orElseThrow(() ->
                new CustomException(Aluno.class).addError(
                    errorBuildMessage(Aluno.class, aluno.getId().toString()))
            );
            BeanUtils.copyProperties(aluno, newAluno, "id");
            return repository.save(newAluno);
        } catch (Exception e) {
            throw new CustomException(Aluno.class).addError(errorBuildMessage(Aluno.class, aluno.getId().toString()));
        }
    }
}