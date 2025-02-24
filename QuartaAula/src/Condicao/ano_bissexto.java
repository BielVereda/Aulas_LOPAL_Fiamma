package Condicao;

import java.util.Scanner;

public class ano_bissexto{
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um ano:");
        int ano = scanner.nextInt();
        
        if (ehBissexto(ano)) {
            System.out.println(ano + " é um ano bissexto.");
        } 
        
        
        else {
            System.out.println(ano + " não é um ano bissexto.");
        }
        
        scanner.close();
    }
    
    public static boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
