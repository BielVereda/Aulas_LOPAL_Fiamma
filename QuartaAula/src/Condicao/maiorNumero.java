package Condicao;

import java.util.Scanner;

public class maiorNumero {
	
	public static void main(String[] args) {
		
		/*Faça um programa que receba dois números e imprima o maior deles.*/
		
		double num1, num2;
				
				Scanner scanner = new Scanner(System.in);
				
		        System.out.print("Digite o primeiro número: ");
		        num1 = scanner.nextDouble();
		        
		        System.out.print("Digite o segundo número: ");
		        num2 = scanner.nextDouble();
			
		        if (num1 > num2) {
		        	System.out.print("O primeiro número é maior: "+num1);
		        }
		        
		        else if (num1 < num2) {
		        	System.out.print("O segundo número é maior: "+num2);
		        }
		        
		        else if (num1 == num2) {
		        	System.out.print("Os números são iguais.");
		        }
		        
        }
	}
