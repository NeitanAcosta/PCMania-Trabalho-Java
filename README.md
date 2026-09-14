# Projeto PCMania - C06 (Programação Orientada a Objetos)

Este repositório contém a solução do exercício prático "PC Mania", desenvolvido como parte da avaliação da disciplina de Programação Orientada a Objetos (C06) do Instituto Nacional de Telecomunicações (Inatel).

## 👨‍🎓 Dados do Aluno
* **Nome:** Nathan Arruola da Costa
* **Curso:** GES
* **Matrícula:** 690

---

## 💻 Visão Geral do Projeto
O sistema simula um terminal interativo de compras de computadores da loja PC Mania. Ele aplica regras de negócio específicas, como precificação dinâmica baseada no número de matrícula do aluno, e demonstra conceitos fundamentais de Programação Orientada a Objetos em Java.

## ⚙️ Funcionalidades Implementadas
* **Menu Interativo:** Exibição de 3 promoções distintas (Apple, Samsung e Dell) com cálculo de preços em tempo real somando constantes à matrícula base.
* **Carrinho de Compras em Array:** Sistema de adição contínua de itens limitados a um array estático (sem uso de `ArrayList`, conforme especificação), mantendo o controle da quantidade comprada.
* **Isolamento de Entrada de Dados:** Apenas o menu de seleção de promoções consome entradas via `Scanner`. Dados intrínsecos do cliente (Nome, CPF) e a matrícula operam de forma estática (hardcoded) para otimizar o fluxo.
* **Geração de Recibo:** Impressão detalhada das configurações exatas de cada máquina adquirida (Hardwares Básicos, Sistema Operacional e Memórias USB) e o cálculo do valor total.

---

## 🏗️ Estrutura e Arquitetura (POO)
O projeto foi modelado com alto rigor às regras de encapsulamento e aos relacionamentos do diagrama UML fornecido:
* **Organização em Pacotes:** Todas as classes estão contidas no pacote `pcmania`, garantindo a organização exigida pelo documento.
* **Encapsulamento Restrito:** Todos os atributos estão declarados como `private`. Foram gerados exclusivamente os métodos `getters` necessários para o funcionamento, evitando métodos ociosos e penalizações.
* **Fidelidade ao UML (Composição e Agregação):** A injeção de dependências (`HardwareBasico` e `SistemaOperacional`) é feita diretamente no construtor de `Computador`, amarrando o ciclo de vida dessas peças à máquina, ao mesmo tempo em que preserva as assinaturas de métodos exatas exigidas pelo UML. A `MemoriaUSB` (agregação) é injetada via método específico `addMemoriaUSB()`.
* **Métodos Utilitários (Helper):** O processamento final do pedido foi isolado na classe `ProcessarPedido`, utilizando o modificador `static` para atuar como um método utilitário independente.

---

## 🤖 Declaração de Uso de Inteligência Artificial

Em conformidade com as instruções da atividade, declaro o uso de Inteligência Artificial para auxílio na validação de regras arquiteturais, discussão de boas práticas em Java e garantia de fidelidade ao diagrama UML durante a codificação.

**Modelo Utilizado:** Google Gemini

**Prompts / Questionamentos Realizados:**
1. *"A partir do diagrama UML e das instruções da PC Mania (como não usar ArrayList e evitar getters/setters desnecessários), gere a estrutura base em Java mantendo o encapsulamento estrito."*
2. *"O documento não menciona se devo pedir o Nome e o CPF do cliente pelo console. Posso deixar essas informações fixas (hardcoded) na classe Main já que as Dicas dizem que a única entrada de dados deve ser a compra dos PCs?"*
3. *"O diagrama mostra composição (losango preenchido) para o Sistema Operacional e Hardware. Se eu instanciar esses objetos internamente na classe Computador, precisarei criar novos métodos que não estão no UML. É melhor passar via construtor na Main para manter a fidelidade visual das assinaturas do diagrama?"*
4. *"A instrução pede a criação de um 'método utilitário (helper)' na classe ProcessarPedido que recebe o array. Em POO com Java, a forma correta de declarar esse helper é utilizando o modificador `static` para chamá-lo diretamente sem instanciar?"*

**Avaliação dos Resultados:**
O resultado da utilização da IA foi **altamente satisfatório e esclarecedor**. A IA não foi usada apenas como um gerador de código, mas como uma ferramenta de *pair programming*. As discussões foram cruciais para validar a interpretação das Dicas do documento (como a entrada estática de dados do cliente) e para equilibrar a teoria de POO com a prática, decidindo manter a injeção via construtor para preservar exatamente as assinaturas do diagrama UML, sem criar métodos adicionais não solicitados. Além disso, confirmou a aplicação do padrão de métodos utilitários estáticos no Java, solidificando os conceitos da disciplina.
