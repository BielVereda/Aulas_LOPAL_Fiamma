package Exercicios_a_ate_h;

import java.util.Scanner;

public class Ex_F {

	//Ler dois valores para as variáveis A e B e efetuar a troca dos
	//valores de forma que a variável A passe a possuir o valor da
	//variável B e a variável B passe a possuir o valor da variável
	//A. Apresentar os valores após a efetivação do
	//processamento da troca.
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, temp;

        System.out.print("Digite o valor de A: ");
        a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        b = scanner.nextInt();
        
        System.out.println("");

        System.out.println("Valores antes da troca:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("");

        temp = a;
        a = b;
        b = temp;

        System.out.println("Valores depois da troca:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("");
        

        scanner.close();
	}
}