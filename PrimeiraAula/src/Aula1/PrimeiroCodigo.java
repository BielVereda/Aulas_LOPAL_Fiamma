package Aula1;

import java.util.Scanner;

public class PrimeiroCodigo {

	public static void main(String[] args) {

		// Olá, mundos:
		System.out.println("Olá, Mundo!");

		// Como criar um Scanner:
		Scanner sc = new Scanner(System.in);

		// Como criar uma variável com entrada de dados:
		String nome = sc.next();
		System.out.println(nome);
		
		int num;
		num = sc.nextInt();
		System.out.print("NOME: "+nome+" NÚMERO: "+num);
		
		sc.close();
		
		
		

	}

}
