package application.impacto_manager_web.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * HorarioAulaGenerated
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-03-19T15:52:55.998221102-03:00[America/Sao_Paulo]")


public class HorarioAulaGenerated   {
  @JsonProperty("horarioInicio")
  private String horarioInicio = null;

  @JsonProperty("horarioFim")
  private String horarioFim = null;

  public HorarioAulaGenerated horarioInicio(String horarioInicio) {
    this.horarioInicio = horarioInicio;
    return this;
  }

  /**
   * Get horarioInicio
   * @return horarioInicio
   **/
  @Schema(description = "")
  
    public String getHorarioInicio() {
    return horarioInicio;
  }

  public void setHorarioInicio(String horarioInicio) {
    this.horarioInicio = horarioInicio;
  }

  public HorarioAulaGenerated horarioFim(String horarioFim) {
    this.horarioFim = horarioFim;
    return this;
  }

  /**
   * Get horarioFim
   * @return horarioFim
   **/
  @Schema(description = "")
  
    public String getHorarioFim() {
    return horarioFim;
  }

  public void setHorarioFim(String horarioFim) {
    this.horarioFim = horarioFim;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HorarioAulaGenerated horarioAula = (HorarioAulaGenerated) o;
    return Objects.equals(this.horarioInicio, horarioAula.horarioInicio) &&
        Objects.equals(this.horarioFim, horarioAula.horarioFim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(horarioInicio, horarioFim);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HorarioAulaGenerated {\n");
    
    sb.append("    horarioInicio: ").append(toIndentedString(horarioInicio)).append("\n");
    sb.append("    horarioFim: ").append(toIndentedString(horarioFim)).append("\n");
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
