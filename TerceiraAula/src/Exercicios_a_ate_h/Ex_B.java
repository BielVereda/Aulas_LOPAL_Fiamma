package Exercicios_a_ate_h;

import java.util.Scanner;

public class Ex_B {
	
    public static void main(String[] args) {
    	
    	//Ler uma temperatura em graus Fahrenheit e apresentá-la
    	//convertida em graus Celsius. A fórmula de conversão é
    	//C ← ((F – 32) * 5) / 9, sendo F a temperatura em Fahrenheit e C
    	//a temperatura em Celsius.
    	
    	//Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        float fahrenheit = scanner.nextFloat();
        
        //Processamento
        float celsius = ((fahrenheit - 32) * 5) / 9;
        
        //Saída
        System.out.println("A temperatura em Celsius é: " + celsius);
        
    }
}
