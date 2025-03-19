package application.impacto_manager_web.mapper;

import application.impacto_manager_web.model.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TurmaMapper {

    TurmaMapper INSTANCE = Mappers.getMapper(TurmaMapper.class);

    @Mapping(source = "horarioAula", target = "horarioAula")
    @Mapping(source = "diaDeAula", target = "diaDeAula")
    @Mapping(source = "alunos", target = "alunos")
    @Mapping(source = "professores", target = "professores")
    TurmaGenerated toTurmaGenerated(Turma turma);

    @Mapping(source = "horarioAula", target = "horarioAula")
    @Mapping(source = "diaDeAula", target = "diaDeAula")
    @Mapping(source = "alunos", target = "alunos")
    @Mapping(source = "professores", target = "professores")
    Turma toTurma(TurmaGenerated turmaGenerated);

    List<TurmaGenerated> toTurmaGeneratedList(List<Turma> turmas);

    HorarioAulaGenerated toHorarioAulaGenerated(HorarioAula horarioAula);

    DiaDeAulaGenerated toDiaDeAulaGenerated(DiaDeAula diaDeAula);
}