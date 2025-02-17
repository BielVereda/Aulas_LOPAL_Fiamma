package Exercicios_a_ate_h;

import java.util.Scanner;

public class imc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //

        System.out.print("Digite o seu peso em kg (ex: 70,5): ");
        double peso = input.nextDouble();

        System.out.print("Digite a sua altura em metros (ex: 1,75): ");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);
        
        System.out.println("");

        System.out.printf("Seu IMC é: %.2f\n", imc);
        
        System.out.println("");

        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 35) {
            classificacao = "Obesidade Grau I";
        } else if (imc < 40) {
            classificacao = "Obesidade Grau II";
        } else {
            classificacao = "Obesidade Mórbida";
        }

        System.out.println("Classificação: " + classificacao);

        input.close();
    }
}
