package Aula1;

import java.util.Scanner;

public class Multiplicacao {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

	    float num1, num2, multi;
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextInt();
		
		multi = num1 * num2;
		
		System.out.print("Multiuplicação: "+num1+" X "+num2+" = "+multi);
		
		sc.close();

	}

}