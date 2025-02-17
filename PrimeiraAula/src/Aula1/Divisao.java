package Aula1;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	    float num1, num2, divisao;
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextInt();
		
		divisao = num1 % num2;
		
		System.out.print("Divisão: "+num1+" ÷ "+num2+" = "+divisao);
		
		sc.close();

	}

}