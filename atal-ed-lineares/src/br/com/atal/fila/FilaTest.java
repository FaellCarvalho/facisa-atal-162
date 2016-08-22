package br.com.atal.fila;

public class FilaTest {

	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.enqueue("Rafael 1");
		fila.enqueue("Rafael 2");
		
		System.out.println(fila.front());
		System.out.println(fila.dequeue());
		System.out.println(fila.front());
		
		
		
	}

}
