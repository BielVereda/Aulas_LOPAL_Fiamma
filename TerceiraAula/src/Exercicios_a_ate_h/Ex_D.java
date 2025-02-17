package Exercicios_a_ate_h;

import java.util.Scanner;

public class Ex_D {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        double tempo, velocidade, distancia, litrosUsados;
        
        //Entrada
        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        tempo = scanner.nextDouble();

        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        velocidade = scanner.nextDouble();
        
        //Processando
        distancia = tempo * velocidade;
        litrosUsados = distancia / 12;

        //Saída
        System.out.printf("Velocidade Média: %.2f km/h%n", velocidade);
        System.out.printf("Tempo Gasto: %.2f horas%n", tempo);
        System.out.printf("Distância Percorrida: %.2f km%n", distancia);
        System.out.printf("Litros Utilizados: %.2f litros%n", litrosUsados);

        scanner.close();
    }
}
