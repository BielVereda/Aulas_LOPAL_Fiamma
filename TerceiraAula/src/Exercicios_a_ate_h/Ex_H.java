package Exercicios_a_ate_h;

import java.util.Scanner;

public class Ex_H {
	
	//Elaborar um programa que calcule e apresente o valor do
	//volume de uma caixa retangular, utilizando a fórmula
	//VOLUME ← COMPRIMENTO * LARGURA * ALTURA.
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        //Entrada
        System.out.print("Digite o comprimento da caixa: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura da caixa: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura da caixa: ");
        double altura = scanner.nextDouble();

        //Processamento
        double volume = comprimento * largura * altura;

        //Saída
        System.out.println("O volume da caixa é: " + volume);

        scanner.close();
    }
}
