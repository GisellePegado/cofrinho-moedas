<div align="center">

# Cofrinho de Moedas

Sistema de cofrinho virtual para gerenciar e converter diferentes tipos de moedas para Real.

![License](https://img.shields.io/badge/license-MIT-blue.svg)
![Language](https://img.shields.io/badge/Java-17+-ED8B00.svg)
![Status](https://img.shields.io/badge/status-active-success.svg)

</div>

---

## 📋 Sobre

O **Cofrinho de Moedas** é um projeto Java desenvolvido como trabalho final da disciplina de Programação Orientada a Objetos do curso de Análise e Desenvolvimento de Sistemas (UNINTER). O sistema simula um cofrinho capaz de armazenar moedas de diferentes países (Real, Dólar e Euro), permitindo adicionar, remover, listar e calcular o total de todas as moedas convertido para Real.

O projeto aplica na prática os quatro pilares da POO: **abstração**, **herança**, **polimorfismo** e **encapsulamento**.

## 🚀 Tecnologias

- **Java** — linguagem principal do projeto
- **Java Collections Framework** — `ArrayList` para gerenciamento da lista de moedas
- **Eclipse IDE** — ambiente de desenvolvimento (configurações em `.classpath` e `.project`)

## 📁 Estrutura do projeto

```
cofrinho-moedas/
├── src/
│   └── uninter/
│       ├── Moeda.java       ← classe abstrata base
│       ├── Real.java        ← moeda Real (BRL)
│       ├── Dolar.java       ← moeda Dólar (USD)
│       ├── Euro.java        ← moeda Euro (EUR)
│       ├── Cofrinho.java    ← gerencia a coleção de moedas
│       └── Principal.java   ← ponto de entrada e menu interativo
├── bin/                     ← bytecode compilado (.class)
├── concepts/                ← documentação de conceitos de POO
├── README.md
└── LICENSE
```

## ⚙️ Como executar

```bash
# Clone o repositório
git clone https://github.com/GisellePegado/cofrinho-moedas.git
cd cofrinho-moedas

# Compile os fontes
javac -d bin src/uninter/*.java

# Execute o programa
java -cp bin uninter.Principal
```

> Também é possível importar o projeto diretamente no **Eclipse IDE** como um projeto Java existente.

## 💱 Taxas de câmbio utilizadas

| Moeda  | Taxa (→ BRL) |
|--------|-------------|
| Dólar  | × 5.76      |
| Euro   | × 6.24      |
| Real   | × 1.00      |

## 📚 Conceitos explorados

Este projeto utiliza os seguintes conceitos de programação orientada a objetos, documentados na pasta [`concepts/`](concepts/):

| Conceito | Descrição resumida |
|----------|--------------------|
| [Classe Abstrata](concepts/abstract-class.md) | `Moeda` define o contrato que todas as moedas devem seguir |
| [Herança](concepts/inheritance.md) | `Real`, `Dolar` e `Euro` estendem `Moeda` reaproveitando estrutura comum |
| [Polimorfismo](concepts/polymorphism.md) | `converter()` e `info()` se comportam diferente em cada subclasse |
| [Encapsulamento](concepts/encapsulation.md) | `listaMoeda` em `Cofrinho` é privada e acessada apenas via métodos públicos |
| [Sobrescrita de Método](concepts/method-overriding.md) | Subclasses redefinem `converter()`, `info()` e `equals()` com `@Override` |
| [ArrayList e Coleções](concepts/arraylist-collections.md) | `ArrayList<Moeda>` armazena e itera sobre as moedas do cofrinho |
| [Tratamento de Exceções](concepts/exception-handling.md) | `try/catch` em `remover()` lida com moedas não encontradas |
| [Igualdade de Objetos](concepts/object-equality.md) | `equals()` customizado compara moedas por tipo e valor |

> Os arquivos de conceito contêm explicações detalhadas e exemplos extraídos do código.

## 🤝 Contribuindo

Contribuições são bem-vindas! Abra uma issue ou envie um pull request.

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
