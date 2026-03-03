package App;

import java.util.Scanner;

import Controller.TaskManager;
import Exceptions.TarefaInvalidaException;
import Model.Tarefa;
import Model.TarefaPrioritaria;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		TaskManager gerenciadorTarefas = new TaskManager();
		
		int opcao;
		
		do {
			System.out.println("===== GERENCIADOR DE TAREFAS =====");
			System.out.println("1. Criar nova tarefa");
			System.out.println("2. Listar tarefas");
			System.out.println("3. Marcar tarefa como concluída");
			System.out.println("4. Remover tarefa");
			System.out.println("5. Sair");
			System.out.println("Escolha uma opção: ");
			
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			try {
				switch(opcao) {
					case 1:
						System.out.println("Título: ");
						String titulo = scanner.nextLine();
						
						System.out.println("Descrição: ");
						String descricao = scanner.nextLine();
						
						System.out.println("É prioritária? (s/n) ");
						String resposta = scanner.nextLine();
						
						System.out.println("Escolha o nível de prioridade:");
						System.out.println("1 - Muito Baixa");
						System.out.println("2 - Baixa");
						System.out.println("3 - Média");
						System.out.println("4 - Alta");
						System.out.println("5 - Muito Alta");
						
						if(resposta.equalsIgnoreCase("s")) {
							System.out.println("Digite o nível de prioridade (1-5): ");
							int prioridade = scanner.nextInt();
							scanner.nextLine();
							
							if(prioridade < 1 || prioridade > 5) {
								System.out.println("Valor inválido! Digite um número entre 1 e 5.");
							}
							
							gerenciadorTarefas.adicionarTarefa(new TarefaPrioritaria(titulo, descricao, prioridade));
						} else {
							gerenciadorTarefas.adicionarTarefa(new Tarefa(titulo, descricao));
						}
						System.out.println("Tarefa adicionada com sucesso!");
						break;
							
					case 2:
						gerenciadorTarefas.listarTarefas();
						break;
					
					case 3:
						System.out.println("Digite o índice da tarefa: ");
						int indiceConclusao = scanner.nextInt();
						gerenciadorTarefas.concluirTarefa(indiceConclusao);
						break;
					
					case 4:
						System.out.println("Digite o índice da tarefa: ");
						int indiceRemover = scanner.nextInt();
						gerenciadorTarefas.removerTarefa(indiceRemover);
						break;
						
					case 5: 
						System.out.println("Encerrando o sistema");
						break;
					
					default:
						System.out.println("Opção inválida!");
				}
				
			} catch (TarefaInvalidaException e) {
				System.out.println("Erro: " + e.getMessage());
			}
		} while (opcao != 5);
		
		scanner.close();

	}

}
