package Model;

public class Tarefa {
	
	private String titulo;
	private String descricao;
	private boolean concluida;
	
	public Tarefa(String titulo, String descricao) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.concluida = false;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		if(titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		} else {
			System.out.println("Título inválido!");
		}
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		if(descricao != null && !descricao.isEmpty()) {
			this.descricao = descricao;
		} else {
			System.out.println("Descrição inválida!");
		}
	}

	public boolean isConcluida() {
		return this.concluida;
	}
	
	public void concluir() {
		this.concluida = true;
	}

	@Override
	public String toString() {
		return "[Título: " + titulo + 
				", Descricao: " + descricao + 
				", Status: " + (concluida ? "Concluída" : "Pendente") + "]";
	}
	
	

	
	
	
	

}
