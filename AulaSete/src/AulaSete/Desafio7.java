package AulaSete;

public class Desafio7 {

	    public static void main(String[] args) {
	        int[] vetorA = {1, 5, 8, 3, 9};
	        int[] vetorB = {2, 5, 7, 3, 1};

	        System.out.println("Números iguais nas mesmas posições:");
	        for (int i = 0; i < vetorA.length; i++) {
	            if (vetorA[i] == vetorB[i]) {
	                System.out.println("Posição " + (i + 1) + ": " + vetorA[i]);
	            }
	        }

	        boolean saoIguais = Arrays.equals(vetorA, vetorB);
	        System.out.println("\nOs vetores são iguais? " + saoIguais);
	    }
	}

}
