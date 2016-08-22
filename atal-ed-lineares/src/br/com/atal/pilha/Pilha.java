package br.com.atal.pilha;


/**
 * Classe responsavel por criar uma pilha
 * 
 * @author Antonio Rafael
 * 
 *
 */

public class Pilha {
	
	private String [] elementosDaPilha;
	
	private int tamanho;
	
	
	/**
	 * Construtor da classe onde utilizo o abs do Math, para evitar
	 * numero negativos
	 * @param capacidade
	 */
	public Pilha (int capacidade){
		elementosDaPilha = new String[Math.abs(capacidade)];
		tamanho = 0;
	}
	
	
	/**
	 * Metodo para verificar se a pilha esta vazia
	 * @return se tamanho for menor que zero return true, se nao
	 * return false
	 */
	public boolean isEmpty(){
		return tamanho <= 0;
	}
	
	
	/**
	 * Metodo para pegar o elemento que estiver no topo da pilha
	 * 
	 * @return tamanho - 1 
	 */
	private int getTopoDaPilha (){
		if (isEmpty())
			return 0;
		return tamanho - 1;
	}
	
	
	/**
	 * Metodo para adicionar um elemento na lista
	 * @param elemento
	 * @return elemento
	 */
	public String push(String elemento){
		if (tamanho == elementosDaPilha.length)
			return null;
		
		tamanho++;
		elementosDaPilha[getTopoDaPilha()] = elemento;
		return elemento;
	}
	
	/**
	 * Metodo para ver o elemento do topo da lista, mas sem retirar
	 * 
	 * @return O elemento do topo da fila
	 */
	public String peek(){
		if(isEmpty())
			return null;
		
		return elementosDaPilha[getTopoDaPilha()];
	}
	
	
	/**
	 * Metodo para remoção do elemento do topo a lista
	 * 
	 * @return topo o elemento do topo a lista
	 */
	public String pop(){
		String topo = peek();
		
		if(topo != null){
			elementosDaPilha[getTopoDaPilha()] = null;
			tamanho--;
		}
		
		return topo;
	}
}
