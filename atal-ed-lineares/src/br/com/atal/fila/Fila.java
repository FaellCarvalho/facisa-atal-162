package br.com.atal.fila;

public class Fila {
	
	Object [] fila = new Object[5];
	private int fim = -1;
	private int inicio = 0;
	private int quantidade = 0;
	
	public void enqueue(Object elemento){
		if (quantidade == fila.length){
			System.out.println("Fila ta cheia");
		}else {
			fim++;
			fila[fim] = elemento;
			quantidade++;
		}
	}
	
	public Object dequeue(){
		if(!isEmpty()){
			Object temp = fila[inicio];
			fila[inicio]= null;
			inicio++;
			if(inicio == fila.length){
				inicio = 0;
			}
			quantidade--;
			return temp;
		}else {
			System.out.println("Fila vazia ");
			return null;
		}
	}
	
	public boolean isEmpty(){
		return quantidade  < 0;
	}
	
	public Object front(){
		if (!isEmpty()){
			return fila[inicio];
		}else {
			System.out.println("Fila Vazia");
			return null;
		}
	}
	
	

}
