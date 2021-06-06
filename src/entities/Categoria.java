package entities;

public class Categoria {
	private int categoria_id;
	private String nome;
	private String descricao;
	
	public int getCategoria_id() {
		return categoria_id;
	}
	
	public void setCategoria_id(int categoria_id) {
		this.categoria_id = categoria_id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + categoria_id;
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
		Categoria other = (Categoria) obj;
		if (categoria_id != other.categoria_id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Categoria [categoria_id=" + categoria_id + ", nome=" + nome + ", descricao=" + descricao + "]";
	}

	public Categoria() {
		
	}
	
}
