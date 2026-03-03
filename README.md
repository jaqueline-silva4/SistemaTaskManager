# 📌 TaskManager – Gerenciador de Tarefas (Console)

Sistema de gerenciamento de tarefas desenvolvido em Java, executado via console, com foco na aplicação prática dos fundamentos da Programação Orientada a Objetos (POO). O projeto implementa criação, listagem, conclusão e remoção de tarefas utilizando estruturas de controle, ArrayList e tratamento de exceções, servindo como base para evoluções futuras com JavaFX e Spring Boot.

---

## 📖 Objetivo do Projeto

Desenvolver, passo a passo, um sistema simples e funcional de gerenciamento de tarefas, aplicando os principais conceitos aprendidos no módulo de Java e POO.

Este projeto também serve como base para futuras evoluções, como:

- Interface gráfica com JavaFX  
- API web com Spring Boot  

---

## 🎯 Funcionalidades

O sistema permite ao usuário:

- Criar novas tarefas  
- Listar todas as tarefas  
- Marcar tarefas como concluídas  
- Remover tarefas existentes  

> ⚠️ Nesta versão, os dados são armazenados apenas em memória (não há persistência em banco de dados).

---

## 🛠️ Fundamentos da Linguagem Utilizados

- Scanner para entrada de dados  
- System.out.println para saída no console  
- Estruturas de decisão: if, else, switch  
- Laços de repetição: for, while, do-while  
- Manipulação de listas com ArrayList<Tarefa>  
- Manipulação básica de String (formatação, comparação, split, etc.)

---

## 🧱 Conceitos de POO Aplicados

- Classes e Objetos  
- Encapsulamento com atributos private e uso de getters/setters  
- Herança (classe TarefaPrioritaria herdando de Tarefa)  
- Polimorfismo (tratamento genérico de tarefas e subtarefas)  
- Classe abstrata BaseTarefa (opcional) ou interface ITarefa  
- Tratamento básico de exceções com try/catch para entradas inválidas  

---

## 🏗️ Organização do Projeto

TaskManager/
│
├── model/        → Classes como Tarefa, TarefaPrioritaria  
├── controller/   → TaskManager (lógica de gerenciamento)  
├── app/          → Classe principal com menu interativo  
└── exceptions/   → Exceções customizadas (opcional)  

---

## 🧠 Lógica do Sistema

A classe TaskManager encapsula a lógica da aplicação e armazena as tarefas em um ArrayList<Tarefa>.

### Métodos principais:

- adicionarTarefa()  
- listarTarefas()  
- concluirTarefa()  
- removerTarefa()  

---

## 💻 Interface no Console

O sistema funciona através de um menu interativo em loop:

===== GERENCIADOR DE TAREFAS =====  
1. Criar nova tarefa  
2. Listar tarefas  
3. Marcar tarefa como concluída  
4. Remover tarefa  
5. Sair  
Escolha uma opção:  

Após executar uma ação, o menu é exibido novamente até que o usuário selecione a opção "Sair".

---

## 👩‍💻 Autora

Jaqueline da Silva Miranda
Estudante de Ciência da Computação
