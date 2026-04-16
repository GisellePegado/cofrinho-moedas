# Sobrescrita de Método (Method Overriding)

## O que é

Sobrescrita de método ocorre quando uma subclasse redefine um método herdado da superclasse, fornecendo uma implementação própria. Em Java, usa-se a anotação `@Override` para indicar explicitamente a intenção de sobrescrever — o compilador então verifica se o método realmente existe na superclasse e se a assinatura está correta, prevenindo erros silenciosos.

A sobrescrita é diferente da **sobrecarga** (overloading): na sobrecarga, vários métodos têm o mesmo nome mas assinaturas diferentes na mesma classe; na sobrescrita, o mesmo nome e assinatura aparecem em classes diferentes (pai e filho), com comportamentos distintos.

## Como é usado neste projeto

Todas as subclasses de `Moeda` (`Real`, `Dolar`, `Euro`) sobrescrevem `converter()` e `info()` com suas lógicas específicas. Além disso, o método `equals()` (originalmente de `Object`) é sobrescrito tanto em `Moeda` quanto nas três subclasses para garantir que a comparação de moedas leve em conta o tipo e o valor.

## Exemplo do projeto

```java
// src/uninter/Euro.java
@Override
double converter() {
    return valor * 6.24; // comportamento exclusivo do Euro
}

@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!super.equals(obj)) return false;
    if (getClass() != obj.getClass()) return false;
    return true;
}
```

## Recursos para aprofundamento

- [Overriding and Hiding Methods – Oracle Docs](https://docs.oracle.com/javase/tutorial/java/IandI/override.html) — documentação oficial sobre sobrescrita em Java
- [Java @Override Annotation – Baeldung](https://www.baeldung.com/java-override) — quando e por que usar `@Override`
