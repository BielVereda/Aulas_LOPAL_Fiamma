package Calculo;

import java.util.Scanner;

public class areaDoRetangulo {

	public static void main(String[] args) {
		
		float largura, comprimento;
		double valor, area, custo;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Olá, seja bem-vindo à nossa loja!");
		System.out.println("Antes de negociar o seu imóvel, precisamos saber algumas informações sobre o imóvel que você procura.");
		
		System.out.println("Digite a largura do imóvel desejado: ");
		largura = leitor.nextFloat();
		
		System.out.println("Digite comprimento do imóvel desejado: ");
		comprimento = leitor.nextFloat();
		
		System.out.println("Digite o valor do metro quadrado do imóvel desejado: ");
		valor = leitor.nextDouble();
		
		area = largura*comprimento;
		
		custo = largura*comprimento*valor;
		
		System.out.print("Área do cômodo: ");
		System.out.println(String.format("%.2f", area));
		
		System.out.print("Custo total: R$");
		System.out.println(String.format("%.2f", custo));
		
		leitor.close();
	}

}
