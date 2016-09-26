package algoritmos.ordenacao.intercalacao;

public class MergeSort {
	
	private int [] array;
	private int [] arrayTemporario;
	private int tamanho;
	
	public static void main(String[] args) {
		 	
			int[] inputArray = {45,23,11,89,77,98,4,28,65,43};
	        MergeSort mms = new MergeSort();
	        mms.sort(inputArray);
	        for(int i:inputArray){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	}
	
	
	public void sort(int inputArray[]){
		this.array = inputArray;
		this.tamanho = inputArray.length;
		this.arrayTemporario = new int[tamanho];
		doMergeSort(0,tamanho - 1);
	}
	
	
	private void doMergeSort(int lowerIndex, int higherIndex){
		if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
	}
	
	private void mergeParts(int lowerIndex, int middle, int higherIndex){
		 for (int i = lowerIndex; i <= higherIndex; i++) {
			 arrayTemporario[i] = array[i];
	        }
	        int i = lowerIndex;
	        int j = middle + 1;
	        int k = lowerIndex;
	        while (i <= middle && j <= higherIndex) {
	            if (arrayTemporario[i] <= arrayTemporario[j]) {
	                array[k] = arrayTemporario[i];
	                i++;
	            } else {
	                array[k] = arrayTemporario[j];
	                j++;
	            }
	            k++;
	        }
	        while (i <= middle) {
	            array[k] = arrayTemporario[i];
	            k++;
	            i++;
	        }
	 
	    }
	}

