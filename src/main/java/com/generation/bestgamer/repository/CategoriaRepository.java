package com.generation.bestgamer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.bestgamer.model.Categoria;


public interface CategoriaRepository extends JpaRepository <Categoria, Long> {
	public List <Categoria> findAllBySetorContainingIgnoreCase(@Param("setor") String setor);

}
