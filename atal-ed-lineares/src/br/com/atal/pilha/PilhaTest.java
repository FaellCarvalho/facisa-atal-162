package br.com.atal.pilha;

public class PilhaTest {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha(3);
		pilha.push("rafael 1");
		pilha.push("rafael 2");
		
		System.out.println(pilha.peek());
		System.out.println(pilha.pop());
		System.out.println(pilha.peek());
	}

}
