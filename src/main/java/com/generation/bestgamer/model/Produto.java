package com.generation.bestgamer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "O atributo Nome do Produto é obrigatorio")
	private String nomeProduto;
	
	@NotNull(message = "O atributo Preço é obrigatorio")
	private String preco;
	
	@NotNull(message = "O atributo Desenvolvedor é obrigatorio")
	private String desenvolvidoPor;
	
	@Size(min = 5, max = 100, message = "O Atributo Descrição precisa ter no mínimo 5 caracter e no máximo 1000")
	@NotNull(message = "O atributo Descrição é obrigatorio")
	private String descricao;
	
    @NotNull(message = "O atributo Data de Lançamento é obrigatorio")
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

	public String getDataLacamento() {
		return dataLancamento;
	}

	public void setDataLacamento(String dataLacamento) {
		this.dataLancamento = dataLacamento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	} 
	
	

}
