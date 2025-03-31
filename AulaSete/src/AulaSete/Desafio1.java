package AulaSete;

import java.util.Scanner;

public class Desafio1 {
		public static void main(String[] args) {
			Scanner banana = new Scanner(System.in);
			
			int vetor[] = new int[5];

			for (int i = 0; i < 5; i++) {
			    System.out.print("Digite o " + (i + 1) + "° número: ");
			    vetor[i] = banana.nextInt();
			}

			for (int i = 0; i < 5; i++) {
			    System.out.print(vetor[i]+" ");
			}
	  }
}