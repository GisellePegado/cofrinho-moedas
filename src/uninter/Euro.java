package uninter;

/**
 * Classe que representa uma moeda do tipo Euro.
 * Estende a classe abstrata Moeda, implementando seus
 * métodos para comportamento específico da moeda Euro.
 */
public class Euro extends Moeda {

    /**
     * Construtor da classe Euro.
     * 
     * @param valor O valor da moeda em Euros
     */
    public Euro(double valor) {
        super(valor);
    }

    /**
     * Converte o valor da moeda Euro para Real.
     * Utiliza a taxa de câmbio de 6.24 para conversão.
     * 
     * @return O valor convertido de Euros para Reais
     */
    @Override
    double converter() {
        return valor * 6.24;
    }

    /**
     * Exibe informações sobre a moeda Euro.
     * Mostra o tipo da moeda (Euro) seguido do seu valor.
     */
    @Override
    void info() {
        System.out.println("Euro - " + valor);
    }

    /**
     * Compara esta moeda Euro com outro objeto para verificar igualdade.
     * Duas moedas Euro são consideradas iguais se tiverem o mesmo valor e forem do mesmo tipo.
     * 
     * @param obj O objeto a ser comparado com esta moeda
     * @return true se as moedas forem iguais, false caso contrário
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        return true;
    }
}
