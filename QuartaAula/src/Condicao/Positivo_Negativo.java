package Condicao;

import java.util.Scanner;

public class Positivo_Negativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        double numero = scanner.nextDouble();
        
        verificarSinal(numero);
        
        scanner.close();
    }
    
    public static void verificarSinal(double numero) {
        if (numero > 0) {
            System.out.println(numero + " é um número positivo.");
        } else if (numero < 0) {
            System.out.println(numero + " é um número negativo.");
        } else {
            System.out.println(numero + " é igual a zero.");
        }
    }
}