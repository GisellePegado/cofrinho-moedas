# Herança (Inheritance)

## O que é

Herança é um dos pilares da Programação Orientada a Objetos (POO). Ela permite que uma classe (chamada de **subclasse** ou classe filha) herde atributos e métodos de outra classe (chamada de **superclasse** ou classe pai). Com isso, evita-se a repetição de código e cria-se uma hierarquia natural entre tipos relacionados.

Em Java, a herança é declarada com a palavra-chave `extends`. Uma subclasse recebe automaticamente tudo que a superclasse possui (exceto membros `private`), podendo ainda adicionar seus próprios atributos e métodos, ou sobrescrever os herdados.

A herança também habilita o **polimorfismo**: uma variável do tipo da superclasse pode referenciar objetos de qualquer subclasse, permitindo escrever código genérico e flexível.

## Como é usado neste projeto

As classes `Real`, `Dolar` e `Euro` (em `src/uninter/`) estendem a classe abstrata `Moeda`. Cada uma herda o atributo `valor` e o construtor de `Moeda`, e implementa os métodos abstratos `converter()` e `info()` de acordo com suas regras específicas. A classe `Cofrinho` trabalha com referências do tipo `Moeda`, sem precisar saber qual subclasse concreta está manipulando.

## Exemplo do projeto

```java
// src/uninter/Dolar.java
public class Dolar extends Moeda {

    public Dolar(double valor) {
        super(valor); // chama o construtor da superclasse Moeda
    }

    @Override
    double converter() {
        return valor * 5.76; // taxa de câmbio do Dólar para Real
    }

    @Override
    void info() {
        System.out.println("Dólar - " + valor);
    }
}
```

## Recursos para aprofundamento

- [Inheritance in Java – Oracle Docs](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html) — tutorial oficial sobre herança em Java
- [Java Inheritance – W3Schools](https://www.w3schools.com/java/java_inheritance.asp) — introdução objetiva com exemplos interativos
