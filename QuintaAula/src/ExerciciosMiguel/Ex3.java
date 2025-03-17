package ExerciciosMiguel;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para gerar a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        int multiplicador = 1;
        do {
            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
            multiplicador++;
        } while (multiplicador <= 10);
    }
}
