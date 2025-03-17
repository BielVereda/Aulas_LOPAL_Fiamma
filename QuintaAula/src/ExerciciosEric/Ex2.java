package ExerciciosEric;


import java.util.Scanner;

public class Ex2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Por favor, digite um número: ");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("Por favor, digite um número positivo.");
            }
        } while (numero <= 0);

        int soma = 0;
        int contagem = 0;

        for (int i = 1; i <= numero; i++) {
            soma += i;
            contagem++;
        }

        System.out.printf("A soma dos números de 1 até %d é: %d%n", numero, soma);
        System.out.printf("A contagem dos números de 1 até %d é: %d%n", numero, contagem);

        scanner.close();
    }
}
