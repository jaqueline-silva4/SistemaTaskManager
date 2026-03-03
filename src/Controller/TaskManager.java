package Controller;

import java.util.ArrayList;

import Exceptions.TarefaInvalidaException;
import Model.Tarefa;

public class TaskManager {
	
	private ArrayList<Tarefa> tarefas;

	public TaskManager() {
		this.tarefas = new ArrayList<>();
	}
	
	public void adicionarTarefa(Tarefa tarefa) throws TarefaInvalidaException{
		if(tarefa.getTitulo().isEmpty()) {
			throw new TarefaInvalidaException("O título não pode ser vazio!");
		}
		tarefas.add(tarefa);
	}
	
	public void listarTarefas() {
		if(tarefas.isEmpty()) {
			System.out.println("Nenhuma tarefa cadastrada!");
			return;
		} 
		for(int i = 0; i < tarefas.size(); i++) {
			System.out.println(" - " + tarefas.get(i));
		}
	}
	
	public void concluirTarefa(int indice) {
		if(indice >= 0 && indice < tarefas.size()) {
			tarefas.get(indice).concluir();
			System.out.println("Tarefa concluída com sucesso!");
		} else {
			System.out.println("Índice inválido!");
		}
	}
	
	public void removerTarefa(int indice) {
		if(indice >= 0 && indice < tarefas.size()) {
			tarefas.remove(indice);
			System.out.println("Tarefa removida com sucesso!");
		} else {
			System.out.println("Índice inválido!");
		}
	}
	
	
	
	
	
	
	

}
