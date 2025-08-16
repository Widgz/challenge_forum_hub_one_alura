package hub.forum.api.challenge.repository;

import hub.forum.api.challenge.domain.curso.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}