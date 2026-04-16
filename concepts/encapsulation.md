# Encapsulamento (Encapsulation)

## O que é

Encapsulamento é o princípio de esconder os detalhes internos de uma classe, expondo apenas o que é necessário para o mundo externo. Em Java, isso é feito com **modificadores de acesso** (`private`, `protected`, `public`): atributos declarados como `private` só podem ser acessados dentro da própria classe, e o acesso externo é controlado por métodos públicos.

Esse princípio protege a integridade dos dados (evita que código externo modifique o estado interno de forma indevida) e reduz o acoplamento entre classes — mudanças na implementação interna não afetam quem usa a classe, desde que a interface pública permaneça a mesma.

## Como é usado neste projeto

Na classe `Cofrinho` (`src/uninter/Cofrinho.java`), a lista de moedas é declarada como `private`. O acesso a ela é feito exclusivamente pelos métodos públicos `adicionar()`, `remover()`, `listagemMoedas()`, `totalConvertido()` e `estaVazio()`. Isso garante que ninguém de fora possa manipular a lista diretamente, prevenindo estados inconsistentes no cofrinho.

## Exemplo do projeto

```java
// src/uninter/Cofrinho.java
public class Cofrinho {

    // atributo privado: inacessível de fora da classe
    private ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();

    // acesso controlado por métodos públicos
    public void adicionar(Moeda moeda) {
        listaMoeda.add(moeda);
    }

    public boolean estaVazio() {
        return listaMoeda.isEmpty();
    }
}
```

## Recursos para aprofundamento

- [Encapsulation – Oracle Docs](https://docs.oracle.com/javase/tutorial/java/concepts/object.html) — conceito de objetos e encapsulamento na documentação oficial
- [Java Encapsulation – W3Schools](https://www.w3schools.com/java/java_encapsulation.asp) — guia introdutório com exemplos de getters e setters
