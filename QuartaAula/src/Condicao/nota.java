package Condicao;

import java.util.Scanner;

public class nota {

	public static void main(String[] args) {
		
		/*Crie um programa que receba a nota de um aluno e imprima "Aprovado" 
		 * se a nota for maior ou igual a 7, e "Reprovado" caso contrário.*/
		
		double nota;
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        nota = scanner.nextDouble();
	
        if (nota >= 7) {
        	System.out.print("Foi aprovado.");
        }
        
        else {
        	System.out.print("Foi reprovado.");
        }
        
	}
}