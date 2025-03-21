package application.impacto_manager_web.service;

import application.impacto_manager_web.exceptions.CustomException;
import application.impacto_manager_web.model.Turma;
import application.impacto_manager_web.model.TurmaGenerated;
import application.impacto_manager_web.repository.TurmaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

import static application.impacto_manager_web.exceptions.ExceptionBuildMessage.errorBuildMessage;

@Service
@AllArgsConstructor
public class TurmaService {
    private final TurmaRepository repository;

    public List<Turma> findAll() {
        return repository.findAll();
    }

    public Turma findById(Long id) {
        return repository.findById(id).orElseThrow(() ->
            new CustomException(Turma.class).addError(
                errorBuildMessage(TurmaService.class, id)
            )
        );
    }

    public List<Turma> findByNome(String nome) {
        return repository.findByNome(nome);
    }

    public Turma createTurma(TurmaGenerated body) {
        Turma turma = new Turma();
        BeanUtils.copyProperties(body, turma);
        return repository.save(turma);
    }

    public void deleteTurma(Turma turma) {
        repository.delete(turma);
    }

    public Turma update(Turma turma) {
        try {
            Turma existingTurma = repository.findById(turma.getId()).orElseThrow(() ->
                new CustomException(Turma.class).addError(
                    errorBuildMessage(TurmaService.class, turma.getId())
                )
            );
            BeanUtils.copyProperties(turma, existingTurma, "id");
            return repository.save(existingTurma);
        } catch (Exception e) {
            throw new CustomException(Turma.class).addError(
                errorBuildMessage(TurmaService.class, turma.getId())
            );
        }
    }
}