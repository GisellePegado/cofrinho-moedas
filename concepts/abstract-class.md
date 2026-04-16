# Classe Abstrata (Abstract Class)

## O que é

Uma classe abstrata é um tipo especial de classe em Java que não pode ser instanciada diretamente — ou seja, não é possível criar objetos dela com `new`. Ela existe para servir como **modelo base** para outras classes, definindo uma estrutura comum que as subclasses devem seguir.

A palavra-chave `abstract` pode ser aplicada tanto à classe quanto a métodos. Um **método abstrato** é declarado sem corpo (sem implementação), obrigando cada subclasse a fornecer sua própria versão do método. Isso garante que toda classe filha implemente aquele comportamento de forma específica.

Esse mecanismo é poderoso porque permite escrever código genérico que trabalha com o tipo abstrato, sem precisar saber de antemão qual subclasse concreta será usada em tempo de execução.

## Como é usado neste projeto

No projeto, a classe `Moeda` (em `src/uninter/Moeda.java`) é declarada como abstrata. Ela define dois métodos abstratos — `converter()` e `info()` — que cada moeda concreta (`Real`, `Dolar`, `Euro`) deve implementar com sua lógica própria. `Moeda` também carrega o atributo `valor` e o construtor compartilhado por todas as subclasses.

## Exemplo do projeto

```java
// src/uninter/Moeda.java
public abstract class Moeda {
    double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    abstract double converter();
    abstract void info();
}
```

## Recursos para aprofundamento

- [Abstract Methods and Classes – Oracle Docs](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html) — documentação oficial da Oracle sobre classes e métodos abstratos em Java
- [Abstract Class in Java – Baeldung](https://www.baeldung.com/java-abstract-class) — guia prático com exemplos de quando e como usar classes abstratas
