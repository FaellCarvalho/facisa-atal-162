package atal.ed.lineares.lista;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		
		
		List<String> lista = new ArrayList<String>();
		lista.add("rafael 1");
		lista.add("rafael 2");
		lista.add("rafael 3");
		
		System.out.println("Elementos da Lista :");
		for(int i = 0; i < lista.size();i++) {
			System.out.println( lista.get(i));
		}
		
		System.out.println("\nRemovendo: " + lista.remove(1));
		
		
		System.out.println("\nElementos da Lista :");
		for(int i = 0; i < lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		
		
	}
}
