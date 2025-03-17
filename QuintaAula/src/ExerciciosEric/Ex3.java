package ExerciciosEric;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Por favor, digite um número não negativo: ");
            numero = scanner.nextInt();
            if (numero < 0) {
                System.out.println("Por favor, digite um número não negativo.");
            }
        } while (numero < 0);

        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.printf("O fatorial de %d é: %d%n", numero, fatorial);

        scanner.close();
    }
}
