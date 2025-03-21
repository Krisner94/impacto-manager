package application.impacto_manager_web.model;

import java.util.Objects;
import application.impacto_manager_web.model.TurmaGenerated;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * ProfessorGenerated
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-03-20T23:24:55.977796988-03:00[America/Sao_Paulo]")


public class ProfessorGenerated   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("turma")
  @Valid
  private List<TurmaGenerated> turma = null;

  public ProfessorGenerated id(Long id) {
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

  public ProfessorGenerated nome(String nome) {
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

  public ProfessorGenerated turma(List<TurmaGenerated> turma) {
    this.turma = turma;
    return this;
  }

  public ProfessorGenerated addTurmaItem(TurmaGenerated turmaItem) {
    if (this.turma == null) {
      this.turma = new ArrayList<>();
    }
    this.turma.add(turmaItem);
    return this;
  }

  /**
   * Get turma
   * @return turma
   **/
  @Schema(description = "")
      @Valid
    public List<TurmaGenerated> getTurma() {
    return turma;
  }

  public void setTurma(List<TurmaGenerated> turma) {
    this.turma = turma;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfessorGenerated professor = (ProfessorGenerated) o;
    return Objects.equals(this.id, professor.id) &&
        Objects.equals(this.nome, professor.nome) &&
        Objects.equals(this.turma, professor.turma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, turma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfessorGenerated {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    turma: ").append(toIndentedString(turma)).append("\n");
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
