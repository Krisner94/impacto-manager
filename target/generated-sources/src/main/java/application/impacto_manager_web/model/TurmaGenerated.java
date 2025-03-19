package application.impacto_manager_web.model;

import java.util.Objects;
import application.impacto_manager_web.model.AlunoGenerated;
import application.impacto_manager_web.model.DiaDeAulaGenerated;
import application.impacto_manager_web.model.HorarioAulaGenerated;
import application.impacto_manager_web.model.ProfessorGenerated;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * TurmaGenerated
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-03-19T13:46:58.557754618-03:00[America/Sao_Paulo]")


public class TurmaGenerated   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nome")
  private String nome = null;

  /**
   * Gets or Sets periodo
   */
  public enum PeriodoEnum {
    MANHA("MANHA"),
    
    TARDE("TARDE"),
    
    NOITE("NOITE");

    private String value;

    PeriodoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PeriodoEnum fromValue(String text) {
      for (PeriodoEnum b : PeriodoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("periodo")
  private PeriodoEnum periodo = null;

  @JsonProperty("diaDeAula")
  @Valid
  private List<DiaDeAulaGenerated> diaDeAula = null;

  @JsonProperty("horarioAula")
  @Valid
  private List<HorarioAulaGenerated> horarioAula = null;

  @JsonProperty("alunos")
  @Valid
  private List<AlunoGenerated> alunos = null;

  @JsonProperty("professores")
  @Valid
  private List<ProfessorGenerated> professores = null;

  public TurmaGenerated id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TurmaGenerated nome(String nome) {
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

  public TurmaGenerated periodo(PeriodoEnum periodo) {
    this.periodo = periodo;
    return this;
  }

  /**
   * Get periodo
   * @return periodo
   **/
  @Schema(description = "")
  
    public PeriodoEnum getPeriodo() {
    return periodo;
  }

  public void setPeriodo(PeriodoEnum periodo) {
    this.periodo = periodo;
  }

  public TurmaGenerated diaDeAula(List<DiaDeAulaGenerated> diaDeAula) {
    this.diaDeAula = diaDeAula;
    return this;
  }

  public TurmaGenerated addDiaDeAulaItem(DiaDeAulaGenerated diaDeAulaItem) {
    if (this.diaDeAula == null) {
      this.diaDeAula = new ArrayList<>();
    }
    this.diaDeAula.add(diaDeAulaItem);
    return this;
  }

  /**
   * Get diaDeAula
   * @return diaDeAula
   **/
  @Schema(description = "")
      @Valid
    public List<DiaDeAulaGenerated> getDiaDeAula() {
    return diaDeAula;
  }

  public void setDiaDeAula(List<DiaDeAulaGenerated> diaDeAula) {
    this.diaDeAula = diaDeAula;
  }

  public TurmaGenerated horarioAula(List<HorarioAulaGenerated> horarioAula) {
    this.horarioAula = horarioAula;
    return this;
  }

  public TurmaGenerated addHorarioAulaItem(HorarioAulaGenerated horarioAulaItem) {
    if (this.horarioAula == null) {
      this.horarioAula = new ArrayList<>();
    }
    this.horarioAula.add(horarioAulaItem);
    return this;
  }

  /**
   * Get horarioAula
   * @return horarioAula
   **/
  @Schema(description = "")
      @Valid
    public List<HorarioAulaGenerated> getHorarioAula() {
    return horarioAula;
  }

  public void setHorarioAula(List<HorarioAulaGenerated> horarioAula) {
    this.horarioAula = horarioAula;
  }

  public TurmaGenerated alunos(List<AlunoGenerated> alunos) {
    this.alunos = alunos;
    return this;
  }

  public TurmaGenerated addAlunosItem(AlunoGenerated alunosItem) {
    if (this.alunos == null) {
      this.alunos = new ArrayList<>();
    }
    this.alunos.add(alunosItem);
    return this;
  }

  /**
   * Get alunos
   * @return alunos
   **/
  @Schema(description = "")
      @Valid
    public List<AlunoGenerated> getAlunos() {
    return alunos;
  }

  public void setAlunos(List<AlunoGenerated> alunos) {
    this.alunos = alunos;
  }

  public TurmaGenerated professores(List<ProfessorGenerated> professores) {
    this.professores = professores;
    return this;
  }

  public TurmaGenerated addProfessoresItem(ProfessorGenerated professoresItem) {
    if (this.professores == null) {
      this.professores = new ArrayList<>();
    }
    this.professores.add(professoresItem);
    return this;
  }

  /**
   * Get professores
   * @return professores
   **/
  @Schema(description = "")
      @Valid
    public List<ProfessorGenerated> getProfessores() {
    return professores;
  }

  public void setProfessores(List<ProfessorGenerated> professores) {
    this.professores = professores;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TurmaGenerated turma = (TurmaGenerated) o;
    return Objects.equals(this.id, turma.id) &&
        Objects.equals(this.nome, turma.nome) &&
        Objects.equals(this.periodo, turma.periodo) &&
        Objects.equals(this.diaDeAula, turma.diaDeAula) &&
        Objects.equals(this.horarioAula, turma.horarioAula) &&
        Objects.equals(this.alunos, turma.alunos) &&
        Objects.equals(this.professores, turma.professores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, periodo, diaDeAula, horarioAula, alunos, professores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TurmaGenerated {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    periodo: ").append(toIndentedString(periodo)).append("\n");
    sb.append("    diaDeAula: ").append(toIndentedString(diaDeAula)).append("\n");
    sb.append("    horarioAula: ").append(toIndentedString(horarioAula)).append("\n");
    sb.append("    alunos: ").append(toIndentedString(alunos)).append("\n");
    sb.append("    professores: ").append(toIndentedString(professores)).append("\n");
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
