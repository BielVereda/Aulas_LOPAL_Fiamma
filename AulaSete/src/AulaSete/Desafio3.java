package AulaSete;

import java.util.Scanner;

public class Desafio3 {
    	public static void main(String[] args) {
    		int[] vetor = {5, 3, 9, 1, 7, 8, 4, 2};

    		System.out.print("Vetor: ");
    		for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
    		}
    		System.out.println();

    		int maior = vetor[0];
    		int menor = vetor[0];

    		for (int i = 1; i < vetor.length; i++) {
    			if (vetor[i] > maior) {
    				maior = vetor[i];
    		} 	else if (vetor[i] < menor) {
                	menor = vetor[i];
            	}
    		}

    		System.out.println("Maior número: " + maior);
    		System.out.println("Menor número: " + menor);
    }
}