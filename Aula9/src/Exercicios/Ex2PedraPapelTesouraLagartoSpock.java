package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex2PedraPapelTesouraLagartoSpock {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Opções: ");
        System.out.println("1. Pedra");
        System.out.println("2. Papel");
        System.out.println("3. Tesoura");
        System.out.println("4. Lagarto");
        System.out.println("5. Spock");
        System.out.print("\nQual será a sua joagada?: ");
        int escolhaUsuario = scanner.nextInt();

        int escolhaComputador = random.nextInt(5) + 1;

        System.out.println("\nVocê escolheu: " + escolha(escolhaUsuario));
        System.out.println("O computador escolheu: " + escolha(escolhaComputador));

        switch (escolhaUsuario) {
            case 1:
                switch (escolhaComputador) {
                    case 1: System.out.println("Empate!"); break;
                    case 2: System.out.println("Você perdeu!"); break;
                    case 3: System.out.println("Você ganhou!"); break;
                    case 4: System.out.println("Você ganhou!"); break;
                    case 5: System.out.println("Você perdeu!"); break;
                }
                break;
            case 2:
                switch (escolhaComputador) {
                    case 1: System.out.println("Você ganhou!"); break;
                    case 2: System.out.println("Empate!"); break;
                    case 3: System.out.println("Você perdeu!"); break;
                    case 4: System.out.println("Você perdeu!"); break;
                    case 5: System.out.println("Você ganhou!"); break;
                }
                break;
            case 3:
                switch (escolhaComputador) {
                    case 1: System.out.println("Você perdeu!"); break;
                    case 2: System.out.println("Você ganhou!"); break;
                    case 3: System.out.println("Empate!"); break;
                    case 4: System.out.println("Você ganhou!"); break;
                    case 5: System.out.println("Você perdeu!"); break;
                }
                break;
            case 4:
                switch (escolhaComputador) {
                    case 1: System.out.println("Você perdeu!"); break;
                    case 2: System.out.println("Você ganhou!"); break;
                    case 3: System.out.println("Você perdeu!"); break;
                    case 4: System.out.println("Empate!"); break;
                    case 5: System.out.println("Você ganhou!"); break;
                }
                break;
            case 5:
                switch (escolhaComputador) {
                    case 1: System.out.println("Você ganhou!"); break;
                    case 2: System.out.println("Você perdeu!"); break;
                    case 3: System.out.println("Você ganhou!"); break;
                    case 4: System.out.println("Você perdeu!"); break;
                    case 5: System.out.println("Empate!"); break;
                }
                break;
                
            default:
                System.out.println("Essa opção não está listada...");break;
                }
        }
    private static String escolha(int escolha) {
        switch (escolha) {
            case 1: return "Pedra";
            case 2: return "Papel";
            case 3: return "Tesoura";
            case 4: return "Lagarto";
            case 5: return "Spock";
            default: return "";
        }
    }
}