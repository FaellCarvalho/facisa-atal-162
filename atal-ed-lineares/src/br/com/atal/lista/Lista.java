package br.com.atal.lista;

public class Lista {
	
	Object [] minhaLista;
	private int tamanho = 0;
	
	public Lista (){
		minhaLista = new Object[10];
	}
	
	public Object get(int posicao){
		if(posicao < tamanho){
			return minhaLista[posicao];
		}else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public void adiciona(Object obj){
		minhaLista[tamanho++] = obj;
	}
	
	public Object remover(int posicao){
		if(posicao < tamanho){
			Object obj = minhaLista[posicao];
			minhaLista[posicao] =null;
			int temp = posicao;
			while (temp < tamanho){
				minhaLista[temp] = minhaLista[temp + 1];
				minhaLista[temp + 1] = null;
				temp++;
			}
			
			tamanho--;
			return obj;
		}else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public int size(){
		return tamanho;
	}
	
}
