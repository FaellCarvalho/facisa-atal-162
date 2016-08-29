package br.com.atal.deque;

import java.util.ArrayList;
import java.util.List;

public class Deque {
	
	private List<Integer> deque = new ArrayList<Integer>();
	
	public void insereNaFrente(int valor){
		System.out.println("Na frente : " + valor);
		deque.add(0,valor);
		System.out.println(deque);
	}
	
	public void insereNoFinal(int valor) {
		System.out.println("No Final : " + valor);
		deque.add(valor);
		System.out.println(deque);
	}
	
	public void removeDoInicio(){
		if(deque.isEmpty()){
			System.out.println("fila vazia");
		}
		
		int rem = deque.remove(0);
		System.out.println("Removido do inicio : " + rem);
		System.out.println(deque);
	}
	
	public void removeDoFinal(){
		if(deque.isEmpty()){
			System.out.println("Fila vazia");
		}
		
		int rem = deque.remove(deque.size() -1);
		System.out.println("Removido do final : " + rem);
		System.out.println(deque);
	}
	
	public int peekInicio(){
		int valor = deque.get(0);
		System.out.println("Primeiro Numero é : " + valor);
		return valor;
	}
	
	public int peekFinal(){
		int valor = deque.get(deque.size() - 1);
		System.out.println("Ultimo Numero é : " + valor);
		return valor;
	}
}
