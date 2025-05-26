package Exercicios;

import java.util.Scanner;

public class Ex5Mascote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] votos = new int[3];
        String[] mascotes = {"Tigre", "Coruja", "Dragão"};

        System.out.println("=== Votação para Mascote da Turma ===");
        System.out.println("1 - Tigre");
        System.out.println("2 - Coruja");
        System.out.println("3 - Dragão");
        System.out.println("0 - Encerrar votação");

        while (true) {
            System.out.print("\nDigite seu voto: ");
            int voto = sc.nextInt();

            switch (voto) {
                case 1:
                case 2:
                case 3:
                case 4:
                    votos[voto - 1]++;
                    break;
                case 0:
                    System.out.println("Votação encerrada!");
                    int total = votos[0] + votos[1] + votos[2];
                    if (total == 0) {
                        System.out.println("Nenhum voto registrado.");
                        return;
                    }
                    System.out.println("\n=== Resultado Final ===");
                    for (int i = 0; i < votos.length; i++) {
                        double perc = (votos[i] * 100.0) / total;
                        System.out.printf("%s: %d votos (%.2f%%)\n", mascotes[i], votos[i], perc);
                    }
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}