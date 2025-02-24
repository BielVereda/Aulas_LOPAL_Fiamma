package Condicao;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        idade = scanner.nextInt();

        if (idade >= 60) {
        	System.out.print("Você é idoso.");
        }
        	
        else if (idade >= 18  && idade <= 59) {
        	System.out.print("Maior de idade.");
        }
        	
        else if (idade <= 17) {
        	System.out.print("Você é menor de idade.");
        } 	
       
        else {
        	System.out.println("Essa idade não paricipa dos nossos critérios.");
        }
        
	}

}
