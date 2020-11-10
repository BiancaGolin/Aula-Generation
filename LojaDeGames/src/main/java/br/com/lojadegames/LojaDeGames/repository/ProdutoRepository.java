package br.com.lojadegames.LojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lojadegames.LojaDeGames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	public List<Produto> findAllByNomeDoJogoContainingIgnoreCase(String nomeDoJogo);
}
