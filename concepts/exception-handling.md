# Tratamento de Exceções (Exception Handling)

## O que é

Exceções são eventos que interrompem o fluxo normal de execução de um programa quando algo inesperado acontece (como tentar remover um item inexistente, dividir por zero, ou acessar um índice fora dos limites). Em Java, exceções são objetos que representam essas situações de erro.

O mecanismo de tratamento usa blocos `try/catch/finally`: o código arriscado fica dentro do `try`; se uma exceção for lançada (`throw`), o bloco `catch` correspondente a captura e trata o erro de forma controlada, evitando que o programa quebre abruptamente. Isso torna o software mais robusto e com mensagens de erro amigáveis ao usuário.

## Como é usado neste projeto

No método `remover()` da classe `Cofrinho` (`src/uninter/Cofrinho.java`), uma `IllegalArgumentException` é lançada caso a moeda solicitada não seja encontrada na lista. O bloco `catch` captura essa exceção e exibe uma mensagem de erro amigável ao usuário, sem travar o programa.

## Exemplo do projeto

```java
// src/uninter/Cofrinho.java
public void remover(Moeda moeda) {
    try {
        if (listaMoeda.contains(moeda)) {
            listaMoeda.remove(moeda);
            System.out.println("Moeda removida com sucesso!");
        } else {
            throw new IllegalArgumentException("Moeda não encontrada no cofrinho.");
        }
    } catch (IllegalArgumentException e) {
        System.out.println("Erro ao remover moeda: " + e.getMessage());
    }
}
```

## Recursos para aprofundamento

- [Exceptions – Oracle Docs](https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html) — tutorial oficial completo sobre exceções em Java
- [Java Exception Handling – Baeldung](https://www.baeldung.com/java-exceptions) — guia abrangente com exemplos práticos de try/catch e exceções customizadas
