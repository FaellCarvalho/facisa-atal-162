package br.com.atal.deque;

public class DequeTest {

	public static void main(String[] args) {
		Deque deque = new Deque();
		deque.insereNaFrente(1);
		deque.insereNaFrente(2); 
		deque.insereNoFinal(3);
		deque.insereNoFinal(4);
		
		deque.removeDoInicio();
		deque.removeDoFinal();
		
		deque.peekInicio();
		deque.peekFinal();
	}

}
