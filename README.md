# Sistema de Fila de Espera - Clínica Médica

Este é um projeto simples em Java que simula um sistema de gerenciamento de fila de espera para uma clínica médica. O programa é executado no console e permite adicionar pacientes à fila, atender o próximo paciente e exibir a fila atual.

## Funcionalidades

* **Adicionar paciente:** Permite inserir o nome de um paciente, que é adicionado ao final da fila.
* **Atender próximo paciente:** Remove o paciente que está no início da fila (o primeiro que chegou).
* **Exibir fila de espera:** Lista todos os pacientes atualmente na fila, em ordem de chegada.
* **Sair:** Encerra a execução do programa.

## Tecnologias Utilizadas

* **Java:** Linguagem de programação principal.
* **`java.util.Queue` (implementado com `LinkedList`):** Estrutura de dados usada para gerenciar a fila (Primeiro a Entrar, Primeiro a Sair - FIFO).
* **`java.util.Scanner`:** Para ler a entrada do usuário no console.

## Como Executar

1.  **Pré-requisito:** Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.

2.  **Clone o repositório** (ou salve o arquivo `.java` em um diretório):
    ```bash
    git clone [URL_DO_SEU_REPOSITORIO]
    cd [NOME_DO_DIRETORIO]
    ```

3.  **Compile o arquivo Java:**
    Abra um terminal no diretório onde o arquivo `SistemaFilaClinica.java` está salvo e execute o seguinte comando:
    ```bash
    javac SistemaFilaClinica.java
    ```

4.  **Execute o programa:**
    Após a compilação (que gera o arquivo `SistemaFilaClinica.class`), execute o programa com o comando:
    ```bash
    java SistemaFilaClinica
    ```

5.  **Interaja com o menu:**
    O programa exibirá um menu de opções no console. Basta digitar o número da opção desejada e pressionar Enter.

    ```
    Sistema de Fila de Espera - Clínica Médica
    ------------------------------------------
    
    Opções:
    1 - Adicionar paciente à fila
    2 - Atender próximo paciente
    3 - Exibir fila de espera
    4 - Sair
    Escolha uma opção:
    ```

## 🧠 Autor
Ítallo Gabriel de Oliveira Correia

💼 Estudante de Análise e Desenvolvimento de Sistemas

📍 Focado em Java, lógica de programação e desenvolvimento de software limpo.