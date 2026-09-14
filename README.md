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
1. *"Com base no diagrama UML e nas instruções da PC Mania, principalmente sobre não utilizar ArrayList e evitar getters e setters que não sejam necessários, como posso montar a estrutura inicial das classes em Java mantendo o encapsulamento?"*
2. *"Posso deixar as informações fixas, de nome e cpf, na classe Main já que as Dicas dizem que a única entrada de dados deve ser a compra dos PCs?"*
3. *"No diagrama UML, o Sistema Operacional e o Hardware aparecem como composição da classe Computador. Nesse caso, é melhor criar esses objetos dentro da própria classe Computador ou passá-los pelo construtor na Main? Quero seguir o diagrama sem precisar criar métodos que não estão previstos nele"*
4. *Quanto ao método utilitário faz sentido usar o modificador static, já que a ideia é utilizar esse método sem precisar criar uma instância da classe?"*

**Avaliação dos Resultados:**
O resultado da utilização da IA foi **totalmente satisfatório**. Utilizei o modelo muito mais como um monitor de dúvidas do que como um simples gerador de código. A ferramenta ajudou a traduzir de forma prática as diferenças de implementação entre Agregação e Composição, e confirmou minhas suspeitas sobre deixar dados estáticos na `Main` e como implementar o método `static` da classe de processamento, tornando o estudo bem mais ágil e direcionado.
