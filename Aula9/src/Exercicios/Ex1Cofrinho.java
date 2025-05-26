package Exercicios;

import java.util.Scanner;

public class Ex1Cofrinho {

	public static void main(String[] args) {
		Scanner banana = new Scanner(System.in);
		
		double umCentavo = 0, moedaCinco = 0, moedaDez = 0, moedaVinteCinco = 0, moedaCinquenta = 0, poupanca = 0;
		int resp, moeda, moedaUm = 0;
		
		System.out.println("Olá, seja bem-vindo ao cofrinho inteligente!");
		System.out.println("Vamos começar a colocar suas moedas no cofre...");
		
		do {
		System.out.println("\n\n\nTipos de moedas que você pode inserir:\n\n1 - Um centavo (R$0,01);\n2 - Cinco centavos (R$0,05);\n3 - Dez centavos (R$0,10);\n4 - Vinte e cinco centavos (R$0,25);\n5 - Cinquenta centavos (R$0,50);\n6 - Um Real (R$1,00);\n7 - Sair.");
		System.out.println("\nQual vai ser o tipo de moeda que você vai depositar?: ");
		resp = banana.nextInt();
		
		switch(resp) {
		case 1: 
			System.out.println("Você vai adicionar quantas moedas de 1 centavo?: ");
			moeda = banana.nextInt();
			umCentavo = moeda * 0.01;
			poupanca += umCentavo;
			continue;
			
		case 2: 
			System.out.print("Você vai adicionar quantas moedas de 2 centavos?: ");
			moeda = banana.nextInt();
			moedaCinco = moeda * 0.05;
			poupanca += moedaCinco;
			continue;
			
		case 3: 
			System.out.print("Você vai adicionar quantas moedas de 10 centavos?: ");
			moeda = banana.nextInt();
			moedaDez = moeda * 0.10;
			poupanca += moedaDez;
			continue;
			
		case 4: 
			System.out.print("Você vai adicionar quantas moedas de 25 centavos?: ");
			moeda = banana.nextInt();
			moedaVinteCinco = moeda * 0.25;
			poupanca += moedaVinteCinco;
			continue;
			
		case 5: 
			System.out.print("Você vai adicionar quantas moedas de 50 centavos?: ");
			moeda = banana.nextInt();
			moedaCinquenta = moeda * 0.50;
			poupanca += moedaCinquenta;
			continue;
			
		case 6: 
			System.out.print("Você vai adicionar quantas moedas de 1 Real?: ");
			moeda = banana.nextInt();
			moedaUm = moeda * 1;
			poupanca += moedaUm;
			continue;
			
		case 7: 
			System.out.println("Saindo....");
		}
		} while(resp != 7);
		
		
		System.out.println("Dinheiro Dentro do cofre: R$"+poupanca);
		if (poupanca>=100) {
			System.out.println("Você conseguiu atingir a sua meta de R$100,00!");
		}
		
		else {
			double meta = poupanca/100;
			System.out.println("Você não atingiu a meta ainda... (R$100,00).");
			System.out.printf("\nSe você continuar depositando essa mesma quantia por semana, você alcançará a meta em %.2f semana(s).", meta);
		}
		System.out.println("");
	}
}