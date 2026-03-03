package Model;

public class TarefaPrioritaria extends Tarefa {
	
	private int nivelDePrioridade;

	public TarefaPrioritaria(String titulo, String descricao, int nivelDePrioridade) {
		super(titulo, descricao);
		this.nivelDePrioridade = nivelDePrioridade;
	}

	public int getNivelDePrioridade() {
		return this.nivelDePrioridade;
	}

	public void setNivelDePrioridade(int nivelDePrioridade) {
		if(nivelDePrioridade > 0) {
			this.nivelDePrioridade = nivelDePrioridade;
		} else {
			System.out.println("Nível de Prioridade inválido!");
		}
	}

	@Override
	public String toString() {
		
		String prioridade;
		switch(nivelDePrioridade) {
			case 1:
				prioridade = "Muito baixa";
				break;
			
			case 2:
				prioridade = "Baixa";
				break;
			
			case 3:
				prioridade = "Média";
				break;
			
			case 4: 
				prioridade = "Alta";
				break;
			
			case 5:
				prioridade = "Muito alta";
				break;
			
			default: 
				prioridade = "Não definida";
		}
		return super.toString() + "[Prioridade: " + prioridade + "]";
	}
	
	
	
	
	
	

}
