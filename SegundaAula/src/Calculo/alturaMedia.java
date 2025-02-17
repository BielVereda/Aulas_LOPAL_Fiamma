package Calculo;

import java.util.Scanner;

public class alturaMedia {

	public static void main(String[] args) {
		
		String nome1, nome2;
		double altura1, altura2, media;
		
		Scanner sc = new Scanner(System.in);
		
		//////////////////////////////////////////////////////////////
		
		System.out.print("Digite o nome da primeira pessoa: ");
		nome1 = sc.nextLine();
		
		System.out.print("Digite a altura da primeira pessoa: ");
		altura1 = sc.nextDouble();
		sc.nextLine();
		
		/////////////////////////////////////////////////////////////
		
		System.out.print("Digite o nome da segunda pessoa: ");
		nome2 = sc.nextLine();
		
		System.out.print("Digite a altura da segunda pessoa: ");
		altura2 = sc.nextDouble();
		
		
		media = (altura1 + altura2) / 2;
		
		System.out.println("A altura média entre "+nome1+" e "+nome2+" é igual à... "+media+"m.");
	}

}
