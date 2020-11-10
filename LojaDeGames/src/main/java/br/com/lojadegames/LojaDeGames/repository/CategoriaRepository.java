package br.com.lojadegames.LojaDeGames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.lojadegames.LojaDeGames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
}
