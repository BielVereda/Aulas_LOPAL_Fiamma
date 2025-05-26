package Exercicios;

import java.util.Scanner;

public class Ex3ValidadorDeSenhas {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (validarSenha(senha)) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida!");
        }

        scanner.close();
    }

    private static boolean validarSenha(String senha) {
        boolean temMaiuscula = false;
        boolean temNumeroPrimo = false;
        boolean temCaractereEspecial = false;
        boolean temVogaisDuplicadas = false;

        String vogais = "aeiouAEIOU";

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);
            if (Character.isUpperCase(c)) temMaiuscula = true;
            if (isNumeroPrimo(c - '0')) temNumeroPrimo = true;
            if (!Character.isLetterOrDigit(c)) temCaractereEspecial = true;
            if (i > 0 && vogais.contains(String.valueOf(c)) && senha.charAt(i - 1) == c) {
                temVogaisDuplicadas = true;
                break;
            }
        }

        return temMaiuscula && temNumeroPrimo && temCaractereEspecial && !temVogaisDuplicadas;
    }

    private static boolean isNumeroPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}