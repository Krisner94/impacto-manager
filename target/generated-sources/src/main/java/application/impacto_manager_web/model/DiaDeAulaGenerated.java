package application.impacto_manager_web.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * DiaDeAulaGenerated
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-03-20T23:24:55.977796988-03:00[America/Sao_Paulo]")


public class DiaDeAulaGenerated   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("dia")
  private String dia = null;

  public DiaDeAulaGenerated id(Long id) {
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

  public DiaDeAulaGenerated dia(String dia) {
    this.dia = dia;
    return this;
  }

  /**
   * Get dia
   * @return dia
   **/
  @Schema(description = "")
  
    public String getDia() {
    return dia;
  }

  public void setDia(String dia) {
    this.dia = dia;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiaDeAulaGenerated diaDeAula = (DiaDeAulaGenerated) o;
    return Objects.equals(this.id, diaDeAula.id) &&
        Objects.equals(this.dia, diaDeAula.dia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiaDeAulaGenerated {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dia: ").append(toIndentedString(dia)).append("\n");
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
