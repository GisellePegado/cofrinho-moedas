package uninter;

/**
 * Classe que representa uma moeda do tipo Dólar.
 * Estende a classe abstrata Moeda, implementando seus
 * métodos para comportamento específico da moeda Dólar.
 */
public class Dolar extends Moeda {

    /**
     * Construtor da classe Dolar.
     * 
     * @param valor O valor da moeda em Dólares
     */
    public Dolar(double valor) {
        super(valor);
    }
    
    /**
     * Converte o valor da moeda Dólar para Real.
     * Utiliza a taxa de câmbio de 5.76 para conversão.
     * 
     * @return O valor convertido de Dólares para Reais
     */
    @Override
    double converter() {
        return valor * 5.76;
    }
    
    /**
     * Exibe informações sobre a moeda Dólar.
     * Mostra o tipo da moeda (Dólar) seguido do seu valor.
     */
    @Override
    void info() {
        System.out.println("Dólar - " + valor);    
    }
    
    /**
     * Compara esta moeda Dólar com outro objeto para verificar igualdade.
     * Duas moedas Dólar são consideradas iguais se tiverem o mesmo valor e forem do mesmo tipo.
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