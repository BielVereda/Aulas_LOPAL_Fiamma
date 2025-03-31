package AulaSete;

public class Desafio10 {
	    public static void main(String[] args) {
	        int[] vetor = {1, 2, 3, 4, 5};

	        int rotacoes = 1;

	        System.out.println("Vetor original:");
	        imprimirVetor(vetor);

	        vetor = rotacionarDireita(vetor, rotacoes);

	        System.out.println("Vetor após rotação:");
	        imprimirVetor(vetor);
	    }

	    public static int[] rotacionarDireita(int[] vetor, int rotacoes) {
	        int tamanho = vetor.length;
	        rotacoes = rotacoes % tamanho;

	        int[] resultado = new int[tamanho];

	        for (int i = 0; i < rotacoes; i++) {
	            resultado[i] = vetor[tamanho - rotacoes + i];
	        }

	        for (int i = rotacoes; i < tamanho; i++) {
	            resultado[i] = vetor[i - rotacoes];
	        }

	        return resultado;
	    }

	    public static void imprimirVetor(int[] vetor) {
	        for (int num : vetor) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}

}
