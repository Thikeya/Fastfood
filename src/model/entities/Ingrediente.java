package model.entities;

import java.sql.Date;

public class Ingrediente {
	private int ingrediente_id;
	private String nome;
	private String unidadeMedida;
	private Date validade;
	private double valorPorcao;
	private int qtdeEstoque;
	
	public int getIngrediente_id() {
		return ingrediente_id;
	}
	
	public void setIngrediente_id(int ingrediente_id) {
		this.ingrediente_id = ingrediente_id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	
	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	
	public Date getValidade() {
		return validade;
	}
	
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	public double getValorPorcao() {
		return valorPorcao;
	}
	
	public void setValorPorcao(double valorPorcao) {
		this.valorPorcao = valorPorcao;
	}
	
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
	
	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ingrediente_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ingrediente other = (Ingrediente) obj;
		if (ingrediente_id != other.ingrediente_id)
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Ingrediente [ingrediente_id=" + ingrediente_id + ", nome=" + nome + ", unidadeMedida=" + unidadeMedida
				+ ", validade=" + validade + ", valorPorcao=" + valorPorcao + ", qtdeEstoque=" + qtdeEstoque + "]";
	}

	public Ingrediente() {
		
	}
}
