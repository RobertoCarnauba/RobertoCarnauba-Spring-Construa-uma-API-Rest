
package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico,Long> {

    public List<Topico> findByCursoNome(String nomeCurso);
    
}
