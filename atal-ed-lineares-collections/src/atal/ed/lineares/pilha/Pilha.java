package atal.ed.lineares.pilha;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Stack <String> pilha = new Stack<>();
		pilha.push("rafael 1");
		pilha.push("rafael 2");
		pilha.push("rafael 3");
		pilha.push("rafael 4");
		
		System.out.println(pilha.peek());
		System.out.println(pilha.pop());
		System.out.println(pilha.peek());
		
		
		
		
	}

}
