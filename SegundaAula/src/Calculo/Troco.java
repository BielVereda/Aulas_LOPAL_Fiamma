package Calculo;

import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preco, dinheiro, troco;
		int quantidade;
		
		System.out.println("Olá, jogador! Seja bem-vindo ao simulador de gerenciamento...");
		System.out.println("Imagine que você trablaha em um caixca de mercado e precisa registrar a última compra que fizeram no dia...");
		System.out.println("Após registrar o produto esse sistema te entrega o valor que deveria ser entregue como troco para o cliente.");
		
		System.out.print("Digite o preço unitário do produto: ");
		preco = sc.nextDouble();
		
		System.out.print("Digite a quantidade: ");
		quantidade = sc.nextInt();
		
		System.out.print("Digite o valor recebido pelo cliente: ");
		dinheiro = sc.nextDouble();
		
		troco = ((preco * quantidade) - (dinheiro))*(-1);
		
		System.out.println("TROCO: R$"+troco);

		
	}

}
