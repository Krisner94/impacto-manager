package application.impacto_manager_web.mapper;

import application.impacto_manager_web.enums.SexoEnum;
import application.impacto_manager_web.model.Aluno;
import application.impacto_manager_web.model.AlunoGenerated;
import application.impacto_manager_web.model.DiaDeAula;
import application.impacto_manager_web.model.DiaDeAulaGenerated;
import application.impacto_manager_web.model.Endereco;
import application.impacto_manager_web.model.EnderecoGenerated;
import application.impacto_manager_web.model.HorarioAula;
import application.impacto_manager_web.model.HorarioAulaGenerated;
import application.impacto_manager_web.model.Professor;
import application.impacto_manager_web.model.ProfessorGenerated;
import application.impacto_manager_web.model.Responsavel;
import application.impacto_manager_web.model.ResponsavelGenerated;
import application.impacto_manager_web.model.Turma;
import application.impacto_manager_web.model.TurmaGenerated;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-19T16:31:52-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
public class TurmaMapperImpl implements TurmaMapper {

    @Override
    public TurmaGenerated toTurmaGenerated(Turma turma) {
        if ( turma == null ) {
            return null;
        }

        TurmaGenerated turmaGenerated = new TurmaGenerated();

        turmaGenerated.setHorarioAula( horarioAulaListToHorarioAulaGeneratedList( turma.getHorarioAula() ) );
        turmaGenerated.setDiaDeAula( diaDeAulaListToDiaDeAulaGeneratedList( turma.getDiaDeAula() ) );
        turmaGenerated.setAlunos( alunoListToAlunoGeneratedList( turma.getAlunos() ) );
        turmaGenerated.setProfessores( professorListToProfessorGeneratedList( turma.getProfessores() ) );
        turmaGenerated.setId( turma.getId() );
        turmaGenerated.setNome( turma.getNome() );

        return turmaGenerated;
    }

    @Override
    public Turma toTurma(TurmaGenerated turmaGenerated) {
        if ( turmaGenerated == null ) {
            return null;
        }

        Turma.TurmaBuilder turma = Turma.builder();

        turma.horarioAula( horarioAulaGeneratedListToHorarioAulaList( turmaGenerated.getHorarioAula() ) );
        turma.diaDeAula( diaDeAulaGeneratedListToDiaDeAulaList( turmaGenerated.getDiaDeAula() ) );
        turma.alunos( alunoGeneratedListToAlunoList( turmaGenerated.getAlunos() ) );
        turma.professores( professorGeneratedListToProfessorList( turmaGenerated.getProfessores() ) );
        turma.id( turmaGenerated.getId() );
        turma.nome( turmaGenerated.getNome() );

        return turma.build();
    }

    @Override
    public List<TurmaGenerated> toTurmaGeneratedList(List<Turma> turmas) {
        if ( turmas == null ) {
            return null;
        }

        List<TurmaGenerated> list = new ArrayList<TurmaGenerated>( turmas.size() );
        for ( Turma turma : turmas ) {
            list.add( toTurmaGenerated( turma ) );
        }

        return list;
    }

    @Override
    public HorarioAulaGenerated toHorarioAulaGenerated(HorarioAula horarioAula) {
        if ( horarioAula == null ) {
            return null;
        }

        HorarioAulaGenerated horarioAulaGenerated = new HorarioAulaGenerated();

        horarioAulaGenerated.setHorarioInicio( horarioAula.getHorarioInicio() );
        horarioAulaGenerated.setHorarioFim( horarioAula.getHorarioFim() );

        return horarioAulaGenerated;
    }

    @Override
    public DiaDeAulaGenerated toDiaDeAulaGenerated(DiaDeAula diaDeAula) {
        if ( diaDeAula == null ) {
            return null;
        }

        DiaDeAulaGenerated diaDeAulaGenerated = new DiaDeAulaGenerated();

        diaDeAulaGenerated.setDia( diaDeAula.getDia() );

        return diaDeAulaGenerated;
    }

    protected List<HorarioAulaGenerated> horarioAulaListToHorarioAulaGeneratedList(List<HorarioAula> list) {
        if ( list == null ) {
            return null;
        }

        List<HorarioAulaGenerated> list1 = new ArrayList<HorarioAulaGenerated>( list.size() );
        for ( HorarioAula horarioAula : list ) {
            list1.add( toHorarioAulaGenerated( horarioAula ) );
        }

        return list1;
    }

    protected List<DiaDeAulaGenerated> diaDeAulaListToDiaDeAulaGeneratedList(List<DiaDeAula> list) {
        if ( list == null ) {
            return null;
        }

        List<DiaDeAulaGenerated> list1 = new ArrayList<DiaDeAulaGenerated>( list.size() );
        for ( DiaDeAula diaDeAula : list ) {
            list1.add( toDiaDeAulaGenerated( diaDeAula ) );
        }

        return list1;
    }

    protected AlunoGenerated.SexoEnum sexoEnumToSexoEnum(SexoEnum sexoEnum) {
        if ( sexoEnum == null ) {
            return null;
        }

        AlunoGenerated.SexoEnum sexoEnum1;

        switch ( sexoEnum ) {
            case MASCULINO: sexoEnum1 = AlunoGenerated.SexoEnum.MASCULINO;
            break;
            case FEMININO: sexoEnum1 = AlunoGenerated.SexoEnum.FEMININO;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + sexoEnum );
        }

        return sexoEnum1;
    }

    protected EnderecoGenerated enderecoToEnderecoGenerated(Endereco endereco) {
        if ( endereco == null ) {
            return null;
        }

        EnderecoGenerated enderecoGenerated = new EnderecoGenerated();

        enderecoGenerated.setCep( endereco.getCep() );
        enderecoGenerated.setRua( endereco.getRua() );
        enderecoGenerated.setBairro( endereco.getBairro() );
        enderecoGenerated.setCidade( endereco.getCidade() );
        enderecoGenerated.setNumeroCasa( endereco.getNumeroCasa() );
        enderecoGenerated.setComplemento( endereco.getComplemento() );

        return enderecoGenerated;
    }

    protected ResponsavelGenerated responsavelToResponsavelGenerated(Responsavel responsavel) {
        if ( responsavel == null ) {
            return null;
        }

        ResponsavelGenerated responsavelGenerated = new ResponsavelGenerated();

        responsavelGenerated.setNome( responsavel.getNome() );
        responsavelGenerated.setParentesco( responsavel.getParentesco() );
        responsavelGenerated.setTelefone( responsavel.getTelefone() );

        return responsavelGenerated;
    }

    protected List<ResponsavelGenerated> responsavelListToResponsavelGeneratedList(List<Responsavel> list) {
        if ( list == null ) {
            return null;
        }

        List<ResponsavelGenerated> list1 = new ArrayList<ResponsavelGenerated>( list.size() );
        for ( Responsavel responsavel : list ) {
            list1.add( responsavelToResponsavelGenerated( responsavel ) );
        }

        return list1;
    }

    protected AlunoGenerated alunoToAlunoGenerated(Aluno aluno) {
        if ( aluno == null ) {
            return null;
        }

        AlunoGenerated alunoGenerated = new AlunoGenerated();

        alunoGenerated.setId( aluno.getId() );
        alunoGenerated.setNome( aluno.getNome() );
        alunoGenerated.setCpf( aluno.getCpf() );
        alunoGenerated.setSexo( sexoEnumToSexoEnum( aluno.getSexo() ) );
        alunoGenerated.setDataNascimento( aluno.getDataNascimento() );
        alunoGenerated.setTelefone( aluno.getTelefone() );
        alunoGenerated.setEndereco( enderecoToEnderecoGenerated( aluno.getEndereco() ) );
        alunoGenerated.setResponsavel( responsavelListToResponsavelGeneratedList( aluno.getResponsavel() ) );

        return alunoGenerated;
    }

    protected List<AlunoGenerated> alunoListToAlunoGeneratedList(List<Aluno> list) {
        if ( list == null ) {
            return null;
        }

        List<AlunoGenerated> list1 = new ArrayList<AlunoGenerated>( list.size() );
        for ( Aluno aluno : list ) {
            list1.add( alunoToAlunoGenerated( aluno ) );
        }

        return list1;
    }

    protected ProfessorGenerated professorToProfessorGenerated(Professor professor) {
        if ( professor == null ) {
            return null;
        }

        ProfessorGenerated professorGenerated = new ProfessorGenerated();

        professorGenerated.setId( professor.getId() );
        professorGenerated.setNome( professor.getNome() );

        return professorGenerated;
    }

    protected List<ProfessorGenerated> professorListToProfessorGeneratedList(List<Professor> list) {
        if ( list == null ) {
            return null;
        }

        List<ProfessorGenerated> list1 = new ArrayList<ProfessorGenerated>( list.size() );
        for ( Professor professor : list ) {
            list1.add( professorToProfessorGenerated( professor ) );
        }

        return list1;
    }

    protected HorarioAula horarioAulaGeneratedToHorarioAula(HorarioAulaGenerated horarioAulaGenerated) {
        if ( horarioAulaGenerated == null ) {
            return null;
        }

        HorarioAula.HorarioAulaBuilder horarioAula = HorarioAula.builder();

        horarioAula.horarioInicio( horarioAulaGenerated.getHorarioInicio() );
        horarioAula.horarioFim( horarioAulaGenerated.getHorarioFim() );

        return horarioAula.build();
    }

    protected List<HorarioAula> horarioAulaGeneratedListToHorarioAulaList(List<HorarioAulaGenerated> list) {
        if ( list == null ) {
            return null;
        }

        List<HorarioAula> list1 = new ArrayList<HorarioAula>( list.size() );
        for ( HorarioAulaGenerated horarioAulaGenerated : list ) {
            list1.add( horarioAulaGeneratedToHorarioAula( horarioAulaGenerated ) );
        }

        return list1;
    }

    protected DiaDeAula diaDeAulaGeneratedToDiaDeAula(DiaDeAulaGenerated diaDeAulaGenerated) {
        if ( diaDeAulaGenerated == null ) {
            return null;
        }

        DiaDeAula.DiaDeAulaBuilder diaDeAula = DiaDeAula.builder();

        diaDeAula.dia( diaDeAulaGenerated.getDia() );

        return diaDeAula.build();
    }

    protected List<DiaDeAula> diaDeAulaGeneratedListToDiaDeAulaList(List<DiaDeAulaGenerated> list) {
        if ( list == null ) {
            return null;
        }

        List<DiaDeAula> list1 = new ArrayList<DiaDeAula>( list.size() );
        for ( DiaDeAulaGenerated diaDeAulaGenerated : list ) {
            list1.add( diaDeAulaGeneratedToDiaDeAula( diaDeAulaGenerated ) );
        }

        return list1;
    }

    protected SexoEnum sexoEnumToSexoEnum1(AlunoGenerated.SexoEnum sexoEnum) {
        if ( sexoEnum == null ) {
            return null;
        }

        SexoEnum sexoEnum1;

        switch ( sexoEnum ) {
            case MASCULINO: sexoEnum1 = SexoEnum.MASCULINO;
            break;
            case FEMININO: sexoEnum1 = SexoEnum.FEMININO;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + sexoEnum );
        }

        return sexoEnum1;
    }

    protected Endereco enderecoGeneratedToEndereco(EnderecoGenerated enderecoGenerated) {
        if ( enderecoGenerated == null ) {
            return null;
        }

        Endereco.EnderecoBuilder endereco = Endereco.builder();

        endereco.cep( enderecoGenerated.getCep() );
        endereco.rua( enderecoGenerated.getRua() );
        endereco.bairro( enderecoGenerated.getBairro() );
        endereco.cidade( enderecoGenerated.getCidade() );
        endereco.numeroCasa( enderecoGenerated.getNumeroCasa() );
        endereco.complemento( enderecoGenerated.getComplemento() );

        return endereco.build();
    }

    protected Responsavel responsavelGeneratedToResponsavel(ResponsavelGenerated responsavelGenerated) {
        if ( responsavelGenerated == null ) {
            return null;
        }

        Responsavel.ResponsavelBuilder responsavel = Responsavel.builder();

        responsavel.nome( responsavelGenerated.getNome() );
        responsavel.parentesco( responsavelGenerated.getParentesco() );
        responsavel.telefone( responsavelGenerated.getTelefone() );

        return responsavel.build();
    }

    protected List<Responsavel> responsavelGeneratedListToResponsavelList(List<ResponsavelGenerated> list) {
        if ( list == null ) {
            return null;
        }

        List<Responsavel> list1 = new ArrayList<Responsavel>( list.size() );
        for ( ResponsavelGenerated responsavelGenerated : list ) {
            list1.add( responsavelGeneratedToResponsavel( responsavelGenerated ) );
        }

        return list1;
    }

    protected Aluno alunoGeneratedToAluno(AlunoGenerated alunoGenerated) {
        if ( alunoGenerated == null ) {
            return null;
        }

        Aluno.AlunoBuilder aluno = Aluno.builder();

        aluno.id( alunoGenerated.getId() );
        aluno.nome( alunoGenerated.getNome() );
        aluno.cpf( alunoGenerated.getCpf() );
        aluno.sexo( sexoEnumToSexoEnum1( alunoGenerated.getSexo() ) );
        aluno.dataNascimento( alunoGenerated.getDataNascimento() );
        aluno.telefone( alunoGenerated.getTelefone() );
        aluno.endereco( enderecoGeneratedToEndereco( alunoGenerated.getEndereco() ) );
        aluno.responsavel( responsavelGeneratedListToResponsavelList( alunoGenerated.getResponsavel() ) );

        return aluno.build();
    }

    protected List<Aluno> alunoGeneratedListToAlunoList(List<AlunoGenerated> list) {
        if ( list == null ) {
            return null;
        }

        List<Aluno> list1 = new ArrayList<Aluno>( list.size() );
        for ( AlunoGenerated alunoGenerated : list ) {
            list1.add( alunoGeneratedToAluno( alunoGenerated ) );
        }

        return list1;
    }

    protected Professor professorGeneratedToProfessor(ProfessorGenerated professorGenerated) {
        if ( professorGenerated == null ) {
            return null;
        }

        Professor.ProfessorBuilder professor = Professor.builder();

        professor.id( professorGenerated.getId() );
        professor.nome( professorGenerated.getNome() );

        return professor.build();
    }

    protected List<Professor> professorGeneratedListToProfessorList(List<ProfessorGenerated> list) {
        if ( list == null ) {
            return null;
        }

        List<Professor> list1 = new ArrayList<Professor>( list.size() );
        for ( ProfessorGenerated professorGenerated : list ) {
            list1.add( professorGeneratedToProfessor( professorGenerated ) );
        }

        return list1;
    }
}
