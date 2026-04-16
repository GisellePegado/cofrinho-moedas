# Igualdade e Identidade de Objetos (Object Equality and Identity)

## O que é

Em Java, há duas formas de comparar objetos: **identidade** (`==`) e **igualdade** (`equals()`). O operador `==` verifica se duas variáveis apontam para o **mesmo objeto na memória** (mesma referência). Já o método `equals()`, herdado de `Object`, pode ser **sobrescrito** para definir o que significa dois objetos serem "iguais" em termos de conteúdo ou valor.

Por padrão, `equals()` em `Object` se comporta como `==`. Para que a comparação seja baseada nos dados do objeto (e não na referência), é preciso sobrescrever o método. Uma boa implementação de `equals()` verifica: (1) se é o mesmo objeto; (2) se o outro é `null`; (3) se são da mesma classe com `getClass()`; e (4) se os atributos relevantes são iguais. É boa prática também sobrescrever `hashCode()` junto com `equals()`.

## Como é usado neste projeto

A classe `Moeda` (`src/uninter/Moeda.java`) sobrescreve `equals()` comparando o `valor` via `Double.doubleToLongBits()` — técnica recomendada para comparar `double` sem erros de arredondamento de ponto flutuante. As subclasses (`Real`, `Dolar`, `Euro`) estendem essa lógica verificando também a classe do objeto, garantindo que um `Real` de valor 10 não seja igual a um `Dolar` de valor 10. Esse `equals()` é usado em `Cofrinho.remover()` pelo método `contains()` da `ArrayList`.

## Exemplo do projeto

```java
// src/uninter/Moeda.java
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;           // mesma referência
    if (obj == null) return false;           // null check
    if (getClass() != obj.getClass()) return false; // mesmo tipo
    Moeda other = (Moeda) obj;
    // comparação segura de double
    return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
}
```

## Recursos para aprofundamento

- [Object Equality – Oracle Docs](https://docs.oracle.com/javase/tutorial/java/IandI/objectclass.html) — documentação sobre os métodos de `Object`, incluindo `equals()`
- [Java equals() and hashCode() – Baeldung](https://www.baeldung.com/java-equals-hashcode-contracts) — guia completo sobre o contrato entre `equals()` e `hashCode()`
