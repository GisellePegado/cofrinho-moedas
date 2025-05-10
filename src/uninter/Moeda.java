package uninter;

/**
 * Classe abstrata que representa uma moeda genérica.
 * Serve como base para diferentes tipos de moedas que podem ser armazenadas no cofrinho.
 * Define métodos abstratos que devem ser implementados pelas subclasses específicas.
 */
public abstract class Moeda {
    /** Valor da moeda em sua unidade original */
    double valor;

    /**
     * Construtor da classe Moeda.
     * 
     * @param valor O valor numérico da moeda
     */
    public Moeda(double valor) {
        super();
        this.valor = valor;
    }

    /**
     * Método abstrato para converter o valor da moeda para Real.
     * Deve ser implementado pelas subclasses específicas.
     * 
     * @return O valor convertido da moeda
     */
    abstract double converter();

    /**
     * Método abstrato para exibir informações sobre a moeda.
     * Deve ser implementado pelas subclasses específicas para
     * mostrar o tipo e o valor da moeda.
     */
    abstract void info();

    /**
     * Compara esta moeda com outro objeto para verificar igualdade.
     * Duas moedas são consideradas iguais se forem do mesmo tipo e tiverem o mesmo valor.
     * 
     * @param obj O objeto a ser comparado com esta moeda
     * @return true se as moedas forem iguais, false caso contrário
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Moeda other = (Moeda) obj;
        return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
    }
}