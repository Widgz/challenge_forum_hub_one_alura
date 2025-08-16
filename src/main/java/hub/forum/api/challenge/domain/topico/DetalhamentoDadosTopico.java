package hub.forum.api.challenge.domain.topico;

import hub.forum.api.challenge.domain.curso.DadosCurso;
import hub.forum.api.challenge.domain.usuario.DadosUsuario;

import java.time.LocalDateTime;

public record DetalhamentoDadosTopico(
        Long id,
        String titulo,
        String mensagem,
        LocalDateTime dataCriacao,
        StatusTopico status,
        DadosUsuario autor,
        DadosCurso curso
) {
    public DetalhamentoDadosTopico(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getDataCriacao(),
                topico.getStatus(),
                new DadosUsuario(topico.getAutor()),
                new DadosCurso(topico.getCurso())
        );
    }
}