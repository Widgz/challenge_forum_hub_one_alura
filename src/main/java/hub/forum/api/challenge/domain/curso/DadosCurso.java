package hub.forum.api.challenge.domain.curso;

import jakarta.validation.constraints.NotBlank;

public record DadosCurso(
        @NotBlank
        String nome,
        String categoria) {
    public DadosCurso(Curso curso) {
        this(curso.getNome(), curso.getCategoria());
    }
}