package application.impacto_manager_web.mapper;

import application.impacto_manager_web.enums.SexoEnum;
import application.impacto_manager_web.model.Aluno;
import application.impacto_manager_web.model.AlunoGenerated;
import application.impacto_manager_web.model.Endereco;
import application.impacto_manager_web.model.EnderecoGenerated;
import application.impacto_manager_web.model.Responsavel;
import application.impacto_manager_web.model.ResponsavelGenerated;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-19T13:47:12-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.6 (Amazon.com Inc.)"
)
public class AlunoMapperImpl implements AlunoMapper {

    @Override
    public AlunoGenerated toAlunoGenerated(Aluno aluno) {
        if ( aluno == null ) {
            return null;
        }

        AlunoGenerated alunoGenerated = new AlunoGenerated();

        alunoGenerated.setEndereco( toEnderecoGenerated( aluno.getEndereco() ) );
        alunoGenerated.setResponsavel( toResponsavelGeneratedList( aluno.getResponsavel() ) );
        alunoGenerated.setId( aluno.getId() );
        alunoGenerated.setNome( aluno.getNome() );
        alunoGenerated.setCpf( aluno.getCpf() );
        alunoGenerated.setSexo( sexoEnumToSexoEnum( aluno.getSexo() ) );
        alunoGenerated.setDataNascimento( aluno.getDataNascimento() );
        alunoGenerated.setTelefone( aluno.getTelefone() );

        return alunoGenerated;
    }

    @Override
    public Aluno toAluno(AlunoGenerated alunoGenerated) {
        if ( alunoGenerated == null ) {
            return null;
        }

        Aluno.AlunoBuilder aluno = Aluno.builder();

        aluno.endereco( enderecoGeneratedToEndereco( alunoGenerated.getEndereco() ) );
        aluno.responsavel( responsavelGeneratedListToResponsavelList( alunoGenerated.getResponsavel() ) );
        aluno.id( alunoGenerated.getId() );
        aluno.nome( alunoGenerated.getNome() );
        aluno.cpf( alunoGenerated.getCpf() );
        aluno.sexo( sexoEnumToSexoEnum1( alunoGenerated.getSexo() ) );
        aluno.dataNascimento( alunoGenerated.getDataNascimento() );
        aluno.telefone( alunoGenerated.getTelefone() );

        return aluno.build();
    }

    @Override
    public List<AlunoGenerated> toAlunoGeneratedList(List<Aluno> alunos) {
        if ( alunos == null ) {
            return null;
        }

        List<AlunoGenerated> list = new ArrayList<AlunoGenerated>( alunos.size() );
        for ( Aluno aluno : alunos ) {
            list.add( toAlunoGenerated( aluno ) );
        }

        return list;
    }

    @Override
    public EnderecoGenerated toEnderecoGenerated(Endereco endereco) {
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

    @Override
    public ResponsavelGenerated toResponsavelGenerated(Responsavel responsavel) {
        if ( responsavel == null ) {
            return null;
        }

        ResponsavelGenerated responsavelGenerated = new ResponsavelGenerated();

        responsavelGenerated.setNome( responsavel.getNome() );
        responsavelGenerated.setParentesco( responsavel.getParentesco() );
        responsavelGenerated.setTelefone( responsavel.getTelefone() );

        return responsavelGenerated;
    }

    @Override
    public List<ResponsavelGenerated> toResponsavelGeneratedList(List<Responsavel> responsaveis) {
        if ( responsaveis == null ) {
            return null;
        }

        List<ResponsavelGenerated> list = new ArrayList<ResponsavelGenerated>( responsaveis.size() );
        for ( Responsavel responsavel : responsaveis ) {
            list.add( toResponsavelGenerated( responsavel ) );
        }

        return list;
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
}
