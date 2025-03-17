package ExerciciosEric;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int a = sc.nextInt();
		
		for (int i=0 ; i <= a ; i = (i+2))
			if(i == a) {
				break;
			}else {
				System.out.println(i);
			}

	}

}
