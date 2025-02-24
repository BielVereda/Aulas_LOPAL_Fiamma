package Desafios;

import java.util.Random;
import java.util.Scanner;

public class adivinhacao {

	public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	       
	        int numeroAleatorio = random.nextInt(100) + 1;
	        
	        int tentativas = 0;
	        boolean acertou = false;
	        
	        System.out.println("Bem-vindo ao jogo de adivinhação!");
	        System.out.println("Tente adivinhar um número entre 1 e 100.");
	        
	        while (!acertou) {
	            System.out.print("Digite sua tentativa: ");
	            int tentativa = scanner.nextInt();
	            
	            tentativas++;
	            
	            if (tentativa < 1 || tentativa > 100) {
	                System.out.println("Por favor, digite um número entre 1 e 100.");
	            } else if (tentativa < numeroAleatorio) {
	                System.out.println("O número que você digitou é menor que o número secreto.");
	            } else if (tentativa > numeroAleatorio) {
	                System.out.println("O número que você digitou é maior que o número secreto.");
	            } else {
	                acertou = true;
	                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
	            }
	        }
	        
	        scanner.close();
	    }
}