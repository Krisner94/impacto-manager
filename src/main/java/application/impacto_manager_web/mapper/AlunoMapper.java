package application.impacto_manager_web.mapper;

import application.impacto_manager_web.model.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AlunoMapper {
    AlunoMapper INSTANCE = Mappers.getMapper(AlunoMapper.class);

    @Mapping(source = "endereco", target = "endereco")
    @Mapping(source = "responsavel", target = "responsavel")
    AlunoGenerated toAlunoGenerated(Aluno aluno);

    @Mapping(source = "endereco", target = "endereco")
    @Mapping(source = "responsavel", target = "responsavel")
    Aluno toAluno(AlunoGenerated alunoGenerated);

    List<AlunoGenerated> toAlunoGeneratedList(List<Aluno> alunos);

    EnderecoGenerated toEnderecoGenerated(Endereco endereco);

    ResponsavelGenerated toResponsavelGenerated(Responsavel responsavel);

    List<ResponsavelGenerated> toResponsavelGeneratedList(List<Responsavel> responsaveis);
}