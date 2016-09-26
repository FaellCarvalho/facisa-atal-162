package algoritmos.ordenacao.troca;

import java.util.Random;

public class QuickSort {
	
	public void quickSort( int [] numeros) {
		quickSort(numeros,0, numeros.length -1, new Random());
	}
	
	// particionar um array com intervalo especificado [esquerda, direita]
	private void quickSort(int [] numeros, int esquerda, int direita, Random random){
		int L = direita - esquerda;
		
		if( L <= 0 ) return; 															//	Um item no intervalo, portanto, não há necessidade de classificar
		int pivo = random.nextInt(L) + esquerda;										// 	Randomicamente escolhe um pivo
		troca(numeros,esquerda,pivo);													//	Troca o pivo com o item mais à esquerda
		pivo = esquerda;																// 	Atualiza o indice do pivo para o indice mais a esquerda
		int lo = esquerda + 1;
		int hi = direita;
		
		while (lo <= hi){
			if(numeros[lo] == numeros[pivo]) ++lo;										// mover para a direita, se baixo item equivale a ponto pivot
			else if (numeros[lo] < numeros[pivo]) troca(numeros, lo++, pivo++);			// trocar baixo item com pivot se baixo item é menor item pivo
			else if (numeros[hi] > numeros[pivo]) --hi;									// mover para a esquerda, se alta item é maior do que o item pivot
			else troca(numeros, lo, hi);												// troca, se baixo item > item alto
		}
		
		quickSort(numeros, lo, direita, random);										// Ordena parte esquerda
		quickSort(numeros, esquerda, pivo -1, random);									// Ordena parte direita
		
	}
	
	// Troca 2 itens no array
	private void troca(int [] numeros, int a , int b){
		int temp = numeros[a];
		numeros[a] = numeros[b];
		numeros[b] = temp;
	}
	
	// Mostra o Array
	private void printArray(int [] array){
		for(int i : array) System.out.println(i + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		
		while(true) {
			int [] array = new int [50];
			Random random = new Random();
			
			for (int i = 0; i < array.length;i++) array[i] = random.nextInt(20);
			System.out.println("original: ");
			qs.printArray(array);
			
			qs.quickSort(array);
			
			System.out.println("Ordenado: ");
			qs.printArray(array);
			
			
		}
		
	}
}
