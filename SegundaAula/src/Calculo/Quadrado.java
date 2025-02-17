package Calculo;

import java.util.Scanner;
import java.lang.Math;

public class Quadrado {

	public static void main(String[] args) {
		
		double diagonal, area, altura, largura, perimetro;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos fazer alguns cálculos com um quadro!");
		
		System.out.println("Digite a largura do quadrado: ");
		largura = sc.nextDouble();
		
		System.out.println("Digite a altura do quadrado: ");
		altura = sc.nextDouble();
		
		/////////////////////////////////////////////////////////////////////
		
		area = largura * altura;
		
		perimetro = largura + largura + altura + altura;
		
		diagonal = (largura * largura)+(altura * altura);
		
		/////////////////////////////////////////////////////////////////////
		
		System.out.print("Área do quadrado: ");
		System.out.println(String.format("%.4f", area));
		
		System.out.print("Perímetro do quadrado: ");
		System.out.println(String.format("%.4f", perimetro));
		
		System.out.print("Diagonal do quadrado: ");
		System.out.println(String.format("%.4f", Math.sqrt((altura*altura)+(largura*largura))));
		
		sc.close();
	}

}
