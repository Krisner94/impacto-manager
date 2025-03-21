package application.impacto_manager_web.mapper;

import application.impacto_manager_web.model.Aluno;
import application.impacto_manager_web.model.AlunoGenerated;
import application.impacto_manager_web.model.Professor;
import application.impacto_manager_web.model.ProfessorGenerated;
import application.impacto_manager_web.model.Turma;
import application.impacto_manager_web.model.TurmaGenerated;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertTo {
    public static Aluno convertToAluno(AlunoGenerated generated) {
        Aluno aluno = new Aluno();
        BeanUtils.copyProperties(generated, aluno);
        return aluno;
    }

    public static AlunoGenerated convertToAlunoGenerated(Aluno aluno) {
        AlunoGenerated generated = new AlunoGenerated();
        BeanUtils.copyProperties(aluno, generated);
        return generated;
    }

    public static List<Aluno> convertToAlunoList(List<AlunoGenerated> generatedList) {
        return generatedList.stream()
            .map(ConvertTo::convertToAluno)
            .collect(Collectors.toList());
    }

    public static List<AlunoGenerated> convertToAlunoGeneratedList(List<Aluno> alunoList) {
        return alunoList.stream()
            .map(ConvertTo::convertToAlunoGenerated)
            .collect(Collectors.toList());
    }

    public static Professor convertToProfessor(ProfessorGenerated generated) {
        Professor professor = new Professor();
        BeanUtils.copyProperties(generated, professor);
        return professor;
    }

    public static ProfessorGenerated convertToProfessorGenerated(Professor professor) {
        ProfessorGenerated generated = new ProfessorGenerated();
        BeanUtils.copyProperties(professor, generated);
        return generated;
    }

    public static List<Professor> convertToProfessorList(List<ProfessorGenerated> generatedList) {
        return generatedList.stream()
            .map(ConvertTo::convertToProfessor)
            .collect(Collectors.toList());
    }

    public static List<ProfessorGenerated> convertToProfessorGeneratedList(List<Professor> professorList) {
        return professorList.stream()
            .map(ConvertTo::convertToProfessorGenerated)
            .collect(Collectors.toList());
    }

    public static Turma convertToTurma(TurmaGenerated generated) {
        Turma turma = new Turma();
        BeanUtils.copyProperties(generated, turma);
        return turma;
    }

    public static TurmaGenerated convertToTurmaGenerated(Turma turma) {
        TurmaGenerated generated = new TurmaGenerated();
        BeanUtils.copyProperties(turma, generated);
        return generated;
    }

    public static List<Turma> convertToTurmaList(List<TurmaGenerated> generatedList) {
        return generatedList.stream()
            .map(ConvertTo::convertToTurma)
            .collect(Collectors.toList());
    }

    public static List<TurmaGenerated> convertToTurmaGeneratedList(List<Turma> turmaList) {
        return turmaList.stream()
            .map(ConvertTo::convertToTurmaGenerated)
            .collect(Collectors.toList());
    }
}