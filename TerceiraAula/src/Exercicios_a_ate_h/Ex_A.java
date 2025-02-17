package Exercicios_a_ate_h;

import java.util.Scanner;

public class Ex_A {
	
    public static void main(String[] args) {
    	
    	//Ler uma temperatura em graus Celsius e apresentá-la
    	//convertida em graus Fahrenheit. A fórmula de conversão é F
    	//← C * 9 / 5 + 32, sendo F a temperatura em Fahrenheit e C
    	//a temperatura em Celsius.
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celsius: ");
        
        float celsius = scanner.nextFloat();
        
        float fahrenheit = (celsius * 9 / 5) + 32;
        
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        
    }
}
