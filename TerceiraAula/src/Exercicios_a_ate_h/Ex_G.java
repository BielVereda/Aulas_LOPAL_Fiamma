package Exercicios_a_ate_h;

import java.util.Scanner;

public class Ex_G {
	
	/*Ler quatro valores numéricos inteiros e apresentar os
	resultados armazenados em memória das adições e
	multiplicações utilizando o mesmo raciocínio aplicado
	quando do uso de propriedades distributivas para a máxima
	combinação possível entre as quatro variáveis. Não é para
	calcular a propriedade distributiva, deve-se apenas usar a
	sua forma de combinação. Considerando a leitura de valores
	para as variáveis A, B, C e D, devem ser feitas seis adições
	e seis multiplicações, ou seja, deve ser combinada a
	variável A com a variável B, a variável A com a variável C, a
	variável A com a variável D. Depois, é necessário combinar
	a variável B com a variável C e a variável B com a variável D
	e, por fim, a variável C será combinada com a variável D.*/
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c, d;

        //Entrada
        System.out.print("Digite o valor de A: ");
        a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        b = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        c = scanner.nextInt();

        System.out.print("Digite o valor de D: ");
        d = scanner.nextInt();

        // Operações
        int adicaoAB = a + b;
        int adicaoAC = a + c;
        int adicaoAD = a + d;
        int adicaoBC = b + c;
        int adicaoBD = b + d;
        int adicaoCD = c + d;

        int multiplicacaoAB = a * b;
        int multiplicacaoAC = a * c;
        int multiplicacaoAD = a * d;
        int multiplicacaoBC = b * c;
        int multiplicacaoBD = b * d;
        int multiplicacaoCD = c * d;

        // Porcessamento
        System.out.println("");
        System.out.println("Resultados das Adições:");
        System.out.println("A + B = " + adicaoAB);
        System.out.println("A + C = " + adicaoAC);
        System.out.println("A + D = " + adicaoAD);
        System.out.println("B + C = " + adicaoBC);
        System.out.println("B + D = " + adicaoBD);
        System.out.println("C + D = " + adicaoCD);
        System.out.println("");

        // Saída
        System.out.println("\nResultados das Multiplicações:");
        System.out.println("A * B = " + multiplicacaoAB);
        System.out.println("A * C = " + multiplicacaoAC);
        System.out.println("A * D = " + multiplicacaoAD);
        System.out.println("B * C = " + multiplicacaoBC);
        System.out.println("B * D = " + multiplicacaoBD);
        System.out.println("C * D = " + multiplicacaoCD);

        scanner.close();
    }
}