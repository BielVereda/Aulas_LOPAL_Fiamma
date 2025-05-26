package SwitchCase;

import java.util.Scanner;

public class PrimeiroProjeto {

	public static void main(String[] args) {
		Scanner banana = new Scanner(System.in);
		
		int num[] = new int[5];
		int key =banana.nextInt();
		
		switch (key) {
		case 1:
			System.out.println("1");
			break;
			
		case 2:
			System.out.println("2");
			break;
			
		default:
			System.out.println("erro");
		}
	}

}
