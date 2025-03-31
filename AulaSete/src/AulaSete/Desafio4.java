package AulaSete;

public class Desafio4 {
	public class ContarPares {
	    public static void main(String[] args) {
	        int[] vetor = {4, 7, 2, 9, 10, 23, 42, 11, 6, 8, 15, 16, 13, 14, 18};
	        
	        System.out.print("Vetor:");
	        for (int num : vetor) {
	            System.out.print(" " + num);
	        }
	        System.out.println();
	        
	        int totalPares = 0;
	        for (int num : vetor) {
	            if (num % 2 == 0) {
	                totalPares++;
	            }
	        }
	        System.out.println("Total de números pares: " + totalPares);
	    }
	}
