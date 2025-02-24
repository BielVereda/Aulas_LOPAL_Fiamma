package Desafios;

import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Digite seu peso em kg: ");
		        double peso = scanner.nextDouble();
		        
		        System.out.print("Digite sua altura em metros: ");
		        double altura = scanner.nextDouble();
		        
		        double imc = calcularIMC(peso, altura);
		        String categoria = classificarIMC(imc);
		        
		        System.out.printf("Seu IMC é: %.2f\n", imc);
		        System.out.println("Você está na categoria: " + categoria);
		        
		        scanner.close();
		    }
		    
		    public static double calcularIMC(double peso, double altura) {
		        return peso / (altura * altura);
		    }
		    
		    public static String classificarIMC(double imc) {
		    	
		    	
		        if (imc < 18.5) {
		            return "Abaixo do peso";
		        } 
		        
		        else if (imc < 25) {
		            return "Peso normal";
		        } 
		        
		        else if (imc < 30) {
		            return "Sobrepeso";
		        } 
		        
		        else {
		            return "Obesidade";
		        }


	}

}
