# ArrayList e Coleções (ArrayList and Collections)

## O que é

`ArrayList` é uma das estruturas de dados mais usadas em Java, pertencente ao **Java Collections Framework**. Ela implementa a interface `List` e armazena elementos em ordem de inserção, permitindo acesso por índice, adição e remoção dinâmica de elementos — ao contrário de arrays comuns, cujo tamanho é fixo após a criação.

O uso de **Generics** (a sintaxe `<Tipo>`) garante que a lista aceite apenas objetos de um tipo específico, prevenindo erros em tempo de execução. `ArrayList` não é sincronizada (não é thread-safe por padrão), mas oferece excelente desempenho para acesso sequencial e adições ao final da lista.

## Como é usado neste projeto

A classe `Cofrinho` (`src/uninter/Cofrinho.java`) mantém uma `ArrayList<Moeda>` chamada `listaMoeda`. Ela armazena todas as moedas adicionadas ao cofrinho e é percorrida com um `for-each` nos métodos `listagemMoedas()` e `totalConvertido()`. O método `contains()` é usado em `remover()` para verificar se a moeda existe antes de tentar removê-la.

## Exemplo do projeto

```java
// src/uninter/Cofrinho.java
private ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();

public void adicionar(Moeda moeda) {
    listaMoeda.add(moeda);
}

public void listagemMoedas() {
    for (Moeda moeda : listaMoeda) {
        moeda.info(); // polimorfismo em ação durante a iteração
    }
}
```

## Recursos para aprofundamento

- [ArrayList – Oracle Docs](https://docs.oracle.com/en/java/docs/api/java.base/java/util/ArrayList.html) — documentação oficial da classe ArrayList
- [Java Collections Framework – Baeldung](https://www.baeldung.com/java-collections) — visão geral completa das coleções em Java
