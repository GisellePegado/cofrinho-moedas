package uninter;

/**
 * Classe que representa uma moeda do tipo Real.
 * Estende a classe abstrata Moeda, implementando seus
 * métodos para comportamento específico da moeda Real.
 */
public class Real extends Moeda {

    /**
     * Construtor da classe Real.
     * 
     * @param valor O valor da moeda em Reais
     */
    public Real(double valor) {
        super(valor);
    }

    /**
     * Converte o valor da moeda Real.
     * Como o Real é a moeda de referência, o método simplesmente retorna o valor original.
     * 
     * @return O valor em Reais, sem conversão
     */
    @Override
    double converter() {
        return valor;
    }

    /**
     * Exibe informações sobre a moeda Real.
     * Mostra o tipo da moeda (Real) seguido do seu valor.
     */
    @Override
    void info() {
        System.out.println("Real - " + valor);
    }

    /**
     * Compara esta moeda Real com outro objeto para verificar igualdade.
     * Duas moedas Real são consideradas iguais se tiverem o mesmo valor e forem do mesmo tipo.
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
