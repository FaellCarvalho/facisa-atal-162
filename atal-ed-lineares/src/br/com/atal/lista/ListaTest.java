package br.com.atal.lista;

public class ListaTest {

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.adiciona(1);
		lista.adiciona(2);
		lista.adiciona(3);
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		lista.remover(0);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
	}

}
