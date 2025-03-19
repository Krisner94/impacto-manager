package application.impacto_manager_web.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * EnderecoGenerated
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-03-19T13:46:58.557754618-03:00[America/Sao_Paulo]")


public class EnderecoGenerated   {
  @JsonProperty("cep")
  private String cep = null;

  @JsonProperty("rua")
  private String rua = null;

  @JsonProperty("bairro")
  private String bairro = null;

  @JsonProperty("cidade")
  private String cidade = null;

  @JsonProperty("numeroCasa")
  private String numeroCasa = null;

  @JsonProperty("complemento")
  private String complemento = null;

  public EnderecoGenerated cep(String cep) {
    this.cep = cep;
    return this;
  }

  /**
   * Get cep
   * @return cep
   **/
  @Schema(description = "")
  
    public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public EnderecoGenerated rua(String rua) {
    this.rua = rua;
    return this;
  }

  /**
   * Get rua
   * @return rua
   **/
  @Schema(description = "")
  
    public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public EnderecoGenerated bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }

  /**
   * Get bairro
   * @return bairro
   **/
  @Schema(description = "")
  
    public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public EnderecoGenerated cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }

  /**
   * Get cidade
   * @return cidade
   **/
  @Schema(description = "")
  
    public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public EnderecoGenerated numeroCasa(String numeroCasa) {
    this.numeroCasa = numeroCasa;
    return this;
  }

  /**
   * Get numeroCasa
   * @return numeroCasa
   **/
  @Schema(description = "")
  
    public String getNumeroCasa() {
    return numeroCasa;
  }

  public void setNumeroCasa(String numeroCasa) {
    this.numeroCasa = numeroCasa;
  }

  public EnderecoGenerated complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }

  /**
   * Get complemento
   * @return complemento
   **/
  @Schema(description = "")
  
    public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnderecoGenerated endereco = (EnderecoGenerated) o;
    return Objects.equals(this.cep, endereco.cep) &&
        Objects.equals(this.rua, endereco.rua) &&
        Objects.equals(this.bairro, endereco.bairro) &&
        Objects.equals(this.cidade, endereco.cidade) &&
        Objects.equals(this.numeroCasa, endereco.numeroCasa) &&
        Objects.equals(this.complemento, endereco.complemento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cep, rua, bairro, cidade, numeroCasa, complemento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnderecoGenerated {\n");
    
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    rua: ").append(toIndentedString(rua)).append("\n");
    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    numeroCasa: ").append(toIndentedString(numeroCasa)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
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
