package Exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Número de dependentes: ");
        int dependentes = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Tipo de plano de saúde (nenhum, basico, avancado): ");
        String planoSaude = scanner.nextLine().toLowerCase();

        System.out.print("Usa vale transporte? (sim/nao): ");
        String usaVT = scanner.nextLine().toLowerCase();

        System.out.print("Usa vale alimentação? (sim/nao): ");
        String usaVA = scanner.nextLine().toLowerCase();

        System.out.print("Usa vale refeição? (sim/nao): ");
        String usaVR = scanner.nextLine().toLowerCase();

        double inss = calcularINSS(salarioBruto);

        double ir = calcularIR(salarioBruto, dependentes);

        double vt = usaVT.equals("sim") ? salarioBruto * 0.06 : 0;
        double va = usaVA.equals("sim") ? 200.0 : 0;
        double vr = usaVR.equals("sim") ? 250.0 : 0;

        double plano = 0;
        if (planoSaude.equals("basico")) {
            plano = 150.0;
        } else if (planoSaude.equals("avancado")) {
            plano = 300.0;
        }

        double totalDescontos = inss + ir + vt + va + vr + plano;
        double salarioLiquido = salarioBruto - totalDescontos;
        double percentualDesconto = (totalDescontos / salarioBruto) * 100;

        System.out.printf("\nSalário Líquido: R$ %.2f%n", salarioLiquido);
        System.out.printf("Total de Descontos: R$ %.2f%n", totalDescontos);
        System.out.printf("Percentual de Descontos: %.2f%%\n", percentualDesconto);

        scanner.close();
    }

    public static double calcularINSS(double salario) {
        double inss = 0;

        if (salario <= 1302.00) {
            inss = salario * 0.08;
        } else if (salario <= 2571.00) {
            inss = salario * 0.09;
        } else if (salario <= 3856.00) {
            inss = salario * 0.11;
        } else {
            inss = salario * 0.14;
            if (inss > 570.88) {
                inss = 570.88;
            }
        }

        return inss;
    }
    public static double calcularIR(double salario, int dependentes) {
        double deducaoDependentes = dependentes * 189.59;
        double baseCalculo = salario - deducaoDependentes;

        double ir = 0;

        if (baseCalculo <= 1903.98) {
            ir = 0;
        } else if (baseCalculo <= 2826.65) {
            ir = baseCalculo * 0.075 - 142.80;
        } else if (baseCalculo <= 3751.05) {
            ir = baseCalculo * 0.15 - 354.80;
        } else if (baseCalculo <= 4664.68) {
            ir = baseCalculo * 0.225 - 636.13;
        } else {
            ir = baseCalculo * 0.275 - 869.36;
        }

        return Math.max(ir, 0);
	}

}
