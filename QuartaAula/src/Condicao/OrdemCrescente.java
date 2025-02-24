package Condicao;

import java.util.Scanner;

public class OrdemCrescente{
	
	public static void main(String[] args) {
		
		/*Elabore um programa que receba três números e os imprima em ordem crescente.*/
		
		double num1, num2, num3;
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();
        
        System.out.print("Digite o terceiro número: ");
        num3 = scanner.nextDouble();
        
        if (num1>num2 && num1>num3 && num2>num3) {
        	System.out.println("Números em ordem crescente: ");
        	System.out.println("Primeiro número: "+num1);
        	System.out.println("Segundo número: "+num2);
        	System.out.println("Terceiro número: "+num3);
        }
        
        else if (num1>num2 && num1>num3 && num3>num2) {
        	System.out.println("Números em ordem crescente: ");
        	System.out.println("Primeiro número: "+num1);
        	System.out.println("Segundo número: "+num3);
        	System.out.println("Terceiro número: "+num2);
        }
        
        else if (num2>num1 && num2>num3 && num1>num3) {
        	System.out.println("Números em ordem crescente: ");
        	System.out.println("Primeiro número: "+num2);
        	System.out.println("Segundo número: "+num1);
        	System.out.println("Terceiro número: "+num3);
        }
		
        else if (num1>num2 && num1>num3 && num3>num2) {
        	System.out.println("Números em ordem crescente: ");
        	System.out.println("Primeiro número: "+num1);
        	System.out.println("Segundo número: "+num3);
        	System.out.println("Terceiro número: "+num2);
        }
        
        else if (num3>num2 && num3>num1 && num1>num2) {
        	System.out.println("Números em ordem crescente: ");
        	System.out.println("Primeiro número: "+num3);
        	System.out.println("Segundo número: "+num1);
        	System.out.println("Terceiro número: "+num2);
        }
        
        else if (num3>num2 && num3>num1 && num2>num1) {
        	System.out.println("Números em ordem crescente: ");
        	System.out.println("Primeiro número: "+num3);
        	System.out.println("Segundo número: "+num2);
        	System.out.println("Terceiro número: "+num1);
        }
	}
}