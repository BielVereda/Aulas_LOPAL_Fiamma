package Aula1;

import java.util.Scanner;

public class Subtracao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float num1, num2, menos;
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextInt();
		
		menos = num1-num2;
		
		System.out.print("Subtração: "+num1+" ÷ "+num2+" = "+menos);
		
		sc.close();

	}

}