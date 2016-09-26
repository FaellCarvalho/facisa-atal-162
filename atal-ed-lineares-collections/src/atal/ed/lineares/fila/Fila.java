package atal.ed.lineares.fila;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		fila.offer("rafael 1");
		fila.offer("rafael 2");
		fila.offer("rafael 3");
		fila.offer("rafael 4");
		System.out.println(fila.peek());

	}
}
