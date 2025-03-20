package application.impacto_manager_web.repository;

import application.impacto_manager_web.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoReppository extends JpaRepository<Aluno, Long> {
}
