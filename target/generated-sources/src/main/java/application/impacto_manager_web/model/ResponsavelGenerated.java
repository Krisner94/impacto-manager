package application.impacto_manager_web.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * ResponsavelGenerated
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-03-19T13:46:58.557754618-03:00[America/Sao_Paulo]")


public class ResponsavelGenerated   {
  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("parentesco")
  private String parentesco = null;

  @JsonProperty("telefone")
  private String telefone = null;

  public ResponsavelGenerated nome(String nome) {
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

  public ResponsavelGenerated parentesco(String parentesco) {
    this.parentesco = parentesco;
    return this;
  }

  /**
   * Get parentesco
   * @return parentesco
   **/
  @Schema(description = "")
  
    public String getParentesco() {
    return parentesco;
  }

  public void setParentesco(String parentesco) {
    this.parentesco = parentesco;
  }

  public ResponsavelGenerated telefone(String telefone) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsavelGenerated responsavel = (ResponsavelGenerated) o;
    return Objects.equals(this.nome, responsavel.nome) &&
        Objects.equals(this.parentesco, responsavel.parentesco) &&
        Objects.equals(this.telefone, responsavel.telefone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, parentesco, telefone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsavelGenerated {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    parentesco: ").append(toIndentedString(parentesco)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
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
