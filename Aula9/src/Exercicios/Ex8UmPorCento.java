package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex8UmPorCento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();

        System.out.print("Operação (+, -, *, /): ");
        char op = sc.next().charAt(0);
        double resultado = 0;

        switch (op) {
            case '+': resultado = a + b; break;
            case '-': resultado = a - b; break;
            case '*': resultado = a * b; break;
            case '/': resultado = b != 0 ? a / b : 0; break;
            default: System.out.println("Operação inválida!"); return;
        }

        double erro = 1 + (rand.nextDouble() * 0.01);
        double resultadoComErro = resultado * erro;

        System.out.printf("Resultado com erro (até 1%%): %.2f\n", resultadoComErro);
    }
}