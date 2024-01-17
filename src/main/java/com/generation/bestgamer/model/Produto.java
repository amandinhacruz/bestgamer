package com.generation.bestgamer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotNull(message = "Atributo nome obrigatorio")
	private String nomeProduto;
	
	@NotNull(message = "Atributo preço é obrigatorio")
	private String preco;
	
	@NotNull(message = "Atributo desenvolivido por é  obrigatorio")
	private String desenvolvidoPor; 
	
	@Size(min = 5, max = 1000, message = "A descrição do produto deve ter no minino 10 caracteres e no maxímo 1000")
	@NotNull(message = "Atributo descrição obrigatorio")
	private String descricao;
	
	@NotNull(message = "Atributo data de lançamento é  obrigatorio")
	private String dataLancamento;
	
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getDesenvolvidoPor() {
		return desenvolvidoPor;
	}

	public void setDesenvolvidoPor(String desenvolvidoPor) {
		this.desenvolvidoPor = desenvolvidoPor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}


	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
