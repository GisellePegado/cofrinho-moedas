package uninter;

import java.util.ArrayList;

/**
 * Classe que representa um cofrinho capaz de armazenar diferentes tipos de moedas.
 * Permite adicionar, remover e listar moedas, além de calcular o valor total
 * convertido para uma moeda de referência.
 */
public class Cofrinho {

    /** Lista que armazena as moedas adicionadas ao cofrinho */
    private ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();

    /**
     * Adiciona uma moeda ao cofrinho.
     * 
     * @param moeda A moeda a ser adicionada ao cofrinho
     */
    public void adicionar(Moeda moeda) {
        listaMoeda.add(moeda);
    }

    /**
     * Remove uma moeda específica do cofrinho.
     * Se a moeda não for encontrada, lança uma exceção que é capturada e 
     * uma mensagem de erro é exibida.
     * 
     * @param moeda A moeda a ser removida do cofrinho
     */
    public void remover(Moeda moeda) {
        try {
            if (listaMoeda.contains(moeda)) {
                listaMoeda.remove(moeda);
                System.out.println("Moeda removida com sucesso!");
            } else {
                throw new IllegalArgumentException("Moeda não encontrada no cofrinho.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao remover moeda: " + e.getMessage());
        }
    }

    /**
     * Lista todas as moedas presentes no cofrinho, exibindo suas informações.
     * Utiliza o método info() de cada moeda para mostrar seus detalhes.
     */
    public void listagemMoedas() {
        if (this.estaVazio()) {
        	System.out.println("O cofrinho está vazio! Não temos moedas a serem listadas.");
        } else {
        	for (Moeda moeda : listaMoeda) {
                moeda.info();
            }
        }
    }

    /**
     * Calcula o valor total das moedas no cofrinho convertido para Real.
     * Utiliza o método converter() de cada moeda para obter seu valor equivalente.
     * 
     * @return O valor total convertido de todas as moedas no cofrinho
     */
    public double totalConvertido() {
        double total = 0;
        for (Moeda moeda : listaMoeda) {
            total += moeda.converter();
        }
        return total;
    }
    
    /**
     * Verifica se o cofrinho está vazio ou não.
     * 
     * @return O booleano com true (verdadeiro) caso o cofrinho esteja vazio e false (falso) caso não esteja vazio
     */
    public boolean estaVazio() {
    	return listaMoeda.isEmpty();
    }
}