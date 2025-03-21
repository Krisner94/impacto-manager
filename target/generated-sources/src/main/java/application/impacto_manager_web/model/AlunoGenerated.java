package application.impacto_manager_web.model;

import java.util.Objects;
import application.impacto_manager_web.model.EnderecoGenerated;
import application.impacto_manager_web.model.ResponsavelGenerated;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * AlunoGenerated
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-03-20T23:24:55.977796988-03:00[America/Sao_Paulo]")


public class AlunoGenerated   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("cpf")
  private String cpf = null;

  /**
   * Gets or Sets sexo
   */
  public enum SexoEnum {
    MASCULINO("MASCULINO"),
    
    FEMININO("FEMININO");

    private String value;

    SexoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SexoEnum fromValue(String text) {
      for (SexoEnum b : SexoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("sexo")
  private SexoEnum sexo = null;

  @JsonProperty("dataNascimento")
  private LocalDate dataNascimento = null;

  @JsonProperty("telefone")
  private String telefone = null;

  @JsonProperty("endereco")
  private EnderecoGenerated endereco = null;

  @JsonProperty("responsavel")
  @Valid
  private List<ResponsavelGenerated> responsavel = null;

  public AlunoGenerated id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AlunoGenerated nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Get nome
   * @return nome
   **/
  @Schema(description = "")
  
    public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public AlunoGenerated cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * Get cpf
   * @return cpf
   **/
  @Schema(description = "")
  
    public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public AlunoGenerated sexo(SexoEnum sexo) {
    this.sexo = sexo;
    return this;
  }

  /**
   * Get sexo
   * @return sexo
   **/
  @Schema(description = "")
  
    public SexoEnum getSexo() {
    return sexo;
  }

  public void setSexo(SexoEnum sexo) {
    this.sexo = sexo;
  }

  public AlunoGenerated dataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }

  /**
   * Get dataNascimento
   * @return dataNascimento
   **/
  @Schema(description = "")
  
    @Valid
    public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public AlunoGenerated telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }

  /**
   * Get telefone
   * @return telefone
   **/
  @Schema(description = "")
  
    public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public AlunoGenerated endereco(EnderecoGenerated endereco) {
    this.endereco = endereco;
    return this;
  }

  /**
   * Get endereco
   * @return endereco
   **/
  @Schema(description = "")
  
    @Valid
    public EnderecoGenerated getEndereco() {
    return endereco;
  }

  public void setEndereco(EnderecoGenerated endereco) {
    this.endereco = endereco;
  }

  public AlunoGenerated responsavel(List<ResponsavelGenerated> responsavel) {
    this.responsavel = responsavel;
    return this;
  }

  public AlunoGenerated addResponsavelItem(ResponsavelGenerated responsavelItem) {
    if (this.responsavel == null) {
      this.responsavel = new ArrayList<>();
    }
    this.responsavel.add(responsavelItem);
    return this;
  }

  /**
   * Get responsavel
   * @return responsavel
   **/
  @Schema(description = "")
      @Valid
    public List<ResponsavelGenerated> getResponsavel() {
    return responsavel;
  }

  public void setResponsavel(List<ResponsavelGenerated> responsavel) {
    this.responsavel = responsavel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlunoGenerated aluno = (AlunoGenerated) o;
    return Objects.equals(this.id, aluno.id) &&
        Objects.equals(this.nome, aluno.nome) &&
        Objects.equals(this.cpf, aluno.cpf) &&
        Objects.equals(this.sexo, aluno.sexo) &&
        Objects.equals(this.dataNascimento, aluno.dataNascimento) &&
        Objects.equals(this.telefone, aluno.telefone) &&
        Objects.equals(this.endereco, aluno.endereco) &&
        Objects.equals(this.responsavel, aluno.responsavel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, cpf, sexo, dataNascimento, telefone, endereco, responsavel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlunoGenerated {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
    sb.append("    responsavel: ").append(toIndentedString(responsavel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
