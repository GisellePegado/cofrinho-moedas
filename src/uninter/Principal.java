package uninter;

import java.util.Scanner;

/**
 * TRABALHO FINAL DA DISCIPLINA PROGRAMAÇÃO ORIENTADA A OBJETO
 * CURSO: CST ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - DISTÂNCIA
 * ALUNA: GISELLE MARIA FERREIRA PEGADO DA SILVA - RU: 5052104
 * 
 * Classe principal que contém o método main e implementa a interface de usuário
 * para um sistema de cofrinho de moedas. Gerencia a interação com o usuário através
 * de menus formatados e opções para manipular diferentes tipos de moedas.
 */
public class Principal {

    /**
     * Método principal que inicia o programa do cofrinho de moedas.
     * Controla o fluxo do programa através de um menu de opções que permite
     * ao usuário adicionar, remover e listar moedas, bem como calcular o
     * valor total convertido para Real.
     */
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    int opcao = -1;
	    Cofrinho cofrinho = new Cofrinho();
	    Moeda moeda = null;
	    
	    int tipoMoeda = 0;
	    double valor = 0;
	    
	    String[] opcoesMenuPrincipal = {
	        "Adicionar moeda", 
	        "Remover moeda", 
	        "Listar moedas", 
	        "Calcular total convertido para Real", 
	        "Encerrar"
	    };
	    
	    String[] opcoesMoedas = {
	        "Real",
	        "Dólar", 
	        "Euro"
	    };
	    
	    while(opcao != 0) {
	        criarMenu("COFRINHO - MENU PRINCIPAL", opcoesMenuPrincipal, "Digite o número da opção desejada: ");
	        opcao = teclado.nextInt();
	        
	        switch(opcao) {
	        case 0: // Encerrar
	            criarMenu("PROGRAMA ENCERRADO", null, null);
	            break;
	        case 1: // Adicionar
	            tipoMoeda = 0;
	            while(tipoMoeda < 1 || tipoMoeda > 3) {
	                criarMenu("COFRINHO - ADICIONAR MOEDA", opcoesMoedas, "Escolha o tipo de moeda: ");
	                tipoMoeda = teclado.nextInt();
	            }
	            
	            System.out.print("Digite o valor que você quer adicionar: ");
	            valor = teclado.nextDouble();
	            
	            switch(tipoMoeda) {
	                case 1:
	                    moeda = new Real(valor);
	                    break;
	                case 2:
	                    moeda = new Dolar(valor);
	                    break;
	                case 3:
	                    moeda = new Euro(valor);
	                    break;
	            }
	            
	            cofrinho.adicionar(moeda);
	            break;
	        case 2: // Remover
	            tipoMoeda = 0;
	            if (cofrinho.estaVazio()) {
	            	System.out.println("O cofrinho está vazio! Não temos moedas a serem removidas.");
	            } else {
	            	while(tipoMoeda < 1 || tipoMoeda > 3) {
		                criarMenu("COFRINHO - REMOVER MOEDA", opcoesMoedas, "Escolha o tipo de moeda: ");
		                tipoMoeda = teclado.nextInt();
		            }
		            
		            System.out.print("Digite o valor que você quer remover: ");
		            valor = teclado.nextDouble();
		            
		            switch(tipoMoeda) {
		                case 1:
		                    moeda = new Real(valor);
		                    break;
		                case 2:
		                    moeda = new Dolar(valor);
		                    break;
		                case 3:
		                    moeda = new Euro(valor);
		                    break;
		            }
		            
		            cofrinho.remover(moeda);
	            }
	            break;
	        case 3: // Listar
	            criarMenu("COFRINHO - LISTA DE MOEDAS", null, null);
	            cofrinho.listagemMoedas();
	            break;
	        case 4: // Calcular total
	            criarMenu("COFRINHO - VALOR TOTAL CONVERTIDO", null, null);
	            System.out.println("O valor total convertido para Real é: " + cofrinho.totalConvertido());
	            break;
	        default:
	            System.out.println("Opção inválida!");
	            break;
	        }
	    }
	}
	
	
	/**
	 * Cria e exibe um menu formatado no console com título, opções numeradas e uma pergunta.
	 * O método centraliza o título entre linhas de separação e ajusta a numeração das opções
	 * de modo que a opção que contém "encerrar" (case-insensitive) seja exibida como opção 0.
	 * 
	 * @param titulo O título do menu que será centralizado
	 * @param opcoes Array de Strings contendo as opções do menu. Se null ou vazio, apenas o título 
	 *               e a pergunta (se fornecida) serão exibidos. A opção que contém "encerrar" será 
	 *               numerada como 0, e as demais opções serão ajustadas conforme necessário.
	 * @param pergunta A pergunta ou prompt a ser exibida após as opções. Se null ou vazia, 
	 *                 nenhuma pergunta será exibida.
	 */
	public static void criarMenu(String titulo, String[] opcoes, String pergunta) {
	    int tamanhoMenu = 40;
	    
	    String linhaSeparacao = "=".repeat(tamanhoMenu);
	    
	    int espacamentoEsquerdo = (tamanhoMenu - titulo.length()) / 2;
	    int espacamentoDireito = tamanhoMenu - titulo.length() - espacamentoEsquerdo;
	    
	    System.out.println(linhaSeparacao);
	    
	    System.out.printf("%" + espacamentoEsquerdo + "s%s%" + espacamentoDireito + "s%n", "", titulo, "");
	    
	    System.out.println(linhaSeparacao);
	    
	    if (opcoes != null && opcoes.length > 0) {
	        int encerrarIndex = -1;
	        for (int i = 0; i < opcoes.length; i++) {
	            if (opcoes[i].toLowerCase().contains("encerrar")) {
	                encerrarIndex = i;
	                break;
	            }
	        }
	        
	        for (int i = 0; i < opcoes.length; i++) {
	            if (i == encerrarIndex) {
	                System.out.printf("0 - %s%n", opcoes[i]);
	            } 
	            else {
	                int numero = (encerrarIndex != -1 && i > encerrarIndex) ? i : i + 1;
	                System.out.printf("%d - %s%n", numero, opcoes[i]);
	            }
	        }
	        
	        System.out.println(linhaSeparacao);
	    }
	    
	    if (pergunta != null && !pergunta.trim().isEmpty()) {
	        System.out.print(pergunta);
	    }
	}

}
