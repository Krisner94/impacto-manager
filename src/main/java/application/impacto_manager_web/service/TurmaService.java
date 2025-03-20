package application.impacto_manager_web.service;

import application.impacto_manager_web.exceptions.CustomException;
import application.impacto_manager_web.model.Aluno;
import application.impacto_manager_web.model.DiaDeAula;
import application.impacto_manager_web.model.HorarioAula;
import application.impacto_manager_web.model.Professor;
import application.impacto_manager_web.model.Turma;
import application.impacto_manager_web.model.TurmaGenerated;
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

    public Turma findById(String id) {
        return repository.findById(id);
    }

    public Turma createTurma(TurmaGenerated body) {
        Turma turma = new Turma();
        BeanUtils.copyProperties(body, turma);

        if (body.getDiaDeAula() != null) {
            turma.setDiaDeAula(
                body.getDiaDeAula().stream()
                    .map(
                        d -> {
                            DiaDeAula diaDeAula = new DiaDeAula();
                            BeanUtils.copyProperties(d, diaDeAula);
                            return diaDeAula;
                        }
                    ).toList()
            );
        }

        if (body.getHorarioAula() != null) {
            turma.setHorarioAula(
                body.getHorarioAula().stream()
                    .map(
                        h -> {
                            HorarioAula horarioAula = new HorarioAula();
                            BeanUtils.copyProperties(h, horarioAula);
                            return horarioAula;
                        }
                    ).toList()
            );
        }

        if (body.getAlunos() != null) {
            turma.setAlunos(
                body.getAlunos().stream()
                    .map(
                        alunoId -> {
                            Aluno aluno = new Aluno();
                            aluno.setId(alunoId.getId());
                            return aluno;
                        }
                    ).toList()
            );
        }

        if (body.getProfessores() != null) {
            turma.setProfessores(
                body.getProfessores().stream()
                    .map(
                        professorId -> {
                            Professor professor = new Professor();
                            professor.setId(professorId.getId());
                            return professor;
                        }
                    ).toList()
            );
        }

        return repository.save(turma);
    }

    public void delete(Turma turma) {
        repository.delete(turma);
    }

    public Turma update(Turma turma) {
        try {
            Turma newTurma = repository.findById(turma.getId());
            BeanUtils.copyProperties(turma, newTurma, "id");
            return repository.save(turma);
        } catch (Exception e) {
            throw new CustomException(Turma.class)
                .addError(errorBuildMessage(Turma.class, turma.getId()));
        }
    }
}
