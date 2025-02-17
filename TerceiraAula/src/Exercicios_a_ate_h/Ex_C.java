package Exercicios_a_ate_h;

import java.util.Scanner;

public class Ex_C {

    public static void main(String[] args) {
    	
    	//Calcular e apresentar o valor do volume de uma lata de
    	//óleo, utilizando a fórmula VOLUME ← 3.14159 * R ↑ 2 * ALTURA.
    	
    	Scanner scanner = new Scanner(System.in);
    	
        // Entrada
        System.out.println("Digite o vaçlor do raio: ");
        double raio = scanner.nextDouble(); 
        
        System.out.println("Digite o valor da altura: ");
        double altura = scanner.nextDouble(); 

        // Processamento
        double volume = 3.14159 * Math.pow(raio, 2) * altura;

        // Saída
        System.out.println("O volume da lata de óleo é: " + volume + " unidades cúbicas");
	    }
	}
