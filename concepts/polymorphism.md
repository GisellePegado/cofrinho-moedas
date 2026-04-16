# Polimorfismo (Polymorphism)

## O que é

Polimorfismo significa "muitas formas". Em POO, é a capacidade de um mesmo método se comportar de maneiras diferentes dependendo do objeto que o executa. Quando uma superclasse define um método e suas subclasses o sobrescrevem (`@Override`), cada subclasse fornece sua própria implementação — mas o chamador só precisa conhecer a interface da superclasse.

Isso torna o código muito mais flexível: é possível escrever algoritmos genéricos que operam sobre a superclasse e automaticamente funcionam para qualquer subclasse, presente ou futura. Em Java, o polimorfismo de subtipo acontece em tempo de execução (dynamic dispatch): o método chamado é decidido com base no tipo real do objeto, não no tipo da variável.

## Como é usado neste projeto

A classe `Cofrinho` armazena uma `ArrayList<Moeda>` e itera sobre ela para chamar `converter()` e `info()`. Não importa se a moeda é `Real`, `Dolar` ou `Euro` — o método correto de cada tipo é chamado automaticamente. Isso está presente em `listagemMoedas()` e `totalConvertido()` do arquivo `src/uninter/Cofrinho.java`.

## Exemplo do projeto

```java
// src/uninter/Cofrinho.java
public double totalConvertido() {
    double total = 0;
    for (Moeda moeda : listaMoeda) {
        total += moeda.converter(); // chama converter() da subclasse correta em tempo de execução
    }
    return total;
}
```

Ao iterar, se `moeda` for um `Dolar`, executa `Dolar.converter()` (× 5.76); se for `Euro`, executa `Euro.converter()` (× 6.24); se for `Real`, retorna o próprio valor — sem nenhum `if/else` no chamador.

## Recursos para aprofundamento

- [Polymorphism in Java – Oracle Docs](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html) — explicação oficial com exemplos didáticos
- [Java Polymorphism – Baeldung](https://www.baeldung.com/java-polymorphism) — artigo detalhado sobre polimorfismo em tempo de compilação e de execução
