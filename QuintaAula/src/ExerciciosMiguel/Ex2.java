package ExerciciosMiguel;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int i = 1;
		Scanner sc = new Scanner(System.in);
		
		while(i != 0) {
			System.out.println("Digite um número: ");
			i = sc.nextInt();
			
			if (i % 2 == 0) {
				System.out.println("O número é par!");
			}
			else if (i % 2 != 0){
				System.out.println("O número é impar!");
			}
			else if (i == 0){
				System.out.println("Saindo...");
			}
		}
		
	}

}