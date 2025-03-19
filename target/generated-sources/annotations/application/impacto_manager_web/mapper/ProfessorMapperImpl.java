package application.impacto_manager_web.mapper;

import application.impacto_manager_web.model.Professor;
import application.impacto_manager_web.model.ProfessorGenerated;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-19T13:47:01-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.6 (Amazon.com Inc.)"
)
public class ProfessorMapperImpl implements ProfessorMapper {

    @Override
    public ProfessorGenerated toProfessorGenerated(Professor professor) {
        if ( professor == null ) {
            return null;
        }

        ProfessorGenerated professorGenerated = new ProfessorGenerated();

        professorGenerated.setId( professor.getId() );
        professorGenerated.setNome( professor.getNome() );

        return professorGenerated;
    }

    @Override
    public Professor toProfessor(ProfessorGenerated professorGenerated) {
        if ( professorGenerated == null ) {
            return null;
        }

        Professor.ProfessorBuilder professor = Professor.builder();

        professor.id( professorGenerated.getId() );
        professor.nome( professorGenerated.getNome() );

        return professor.build();
    }

    @Override
    public List<ProfessorGenerated> toProfessorGeneratedList(List<Professor> professores) {
        if ( professores == null ) {
            return null;
        }

        List<ProfessorGenerated> list = new ArrayList<ProfessorGenerated>( professores.size() );
        for ( Professor professor : professores ) {
            list.add( toProfessorGenerated( professor ) );
        }

        return list;
    }
}
