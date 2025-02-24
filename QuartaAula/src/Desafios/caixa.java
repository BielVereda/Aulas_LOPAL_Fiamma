package Desafios;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class caixa {

	public static void main(String[] args) {

	class Conta {
	    private String nome;
	    private double saldo;

	    public Conta(String nome) {
	        this.nome = nome;
	        this.saldo = 0.0;
	    }

	    public void depositar(double valor) {
	        if (valor > 0) {
	            saldo += valor;
	            System.out.println("Depósito realizado com sucesso. Novo saldo: R$ " + saldo);
	        } else {
	            System.out.println("Valor de depósito inválido. Por favor, digite um valor positivo.");
	        }
	    }

	    public void sacar(double valor) {
	        if (valor > 0 && valor <= saldo) {
	            saldo -= valor;
	            System.out.println("Saque realizado com sucesso. Novo saldo: R$ " + saldo);
	        } else if (valor <= 0) {
	            System.out.println("Valor de saque inválido. Por favor, digite um valor positivo.");
	        } else {
	            System.out.println("Saldo insuficiente para realizar o saque.");
	        }
	    }

	    public void consultarSaldo() {
	        System.out.println("Seu saldo atual é: R$ " + saldo);
	    }

	    public String getNome() {
	        return nome;
	    }
	}

	public class SistemaContas {
	    private Map<String, Conta> contas;
	    private Scanner scanner;

	    public SistemaContas() {
	        this.contas = new HashMap<>();
	        this.scanner = new Scanner(System.in);
	    }

	    public void criarConta() {
	        System.out.print("Digite o nome da conta: ");
	        String nome = scanner.nextLine();
	        
	        if (!contas.containsKey(nome)) {
	            contas.put(nome, new Conta(nome));
	            System.out.println("Conta criada com sucesso!");
	        } else {
	            System.out.println("Já existe uma conta com esse nome.");
	        }
	    }

	    public void depositar() {
	        System.out.print("Digite o nome da conta para depositar: ");
	        String nome = scanner.nextLine();
	        
	        if (contas.containsKey(nome)) {
	            System.out.print("Digite o valor para depositar: R$ ");
	            double valor = scanner.nextDouble();
	            scanner.nextLine();
	            
	            contas.get(nome).depositar(valor);
	        } else {
	            System.out.println("Conta não encontrada.");
	        }
	    }

	    public void sacar() {
	        System.out.print("Digite o nome da conta para sacar: ");
	        String nome = scanner.nextLine();
	        
	        if (contas.containsKey(nome)) {
	            System.out.print("Digite o valor para sacar: R$ ");
	            double valor = scanner.nextDouble();
	            scanner.nextLine();
	            
	            contas.get(nome).sacar(valor);
	        } else {
	            System.out.println("Conta não encontrada.");
	        }
	    }

	    public void consultarSaldo() {
	        System.out.print("Digite o nome da conta para consultar saldo: ");
	        String nome = scanner.nextLine();
	        
	        if (contas.containsKey(nome)) {
	            contas.get(nome).consultarSaldo();
	        } else {
	            System.out.println("Conta não encontrada.");
	        }
	    }

	    public void listarContas() {
	        if (contas.isEmpty()) {
	            System.out.println("Nenhuma conta criada.");
	        } else {
	            System.out.println("Contas criadas:");
	            for (Conta conta : contas.values()) {
	                System.out.println(conta.getNome());
	            }
	        }
	    }

	    public void executar() {
	        boolean continuar = true;
	        
	        while (continuar) {
	            System.out.println("\n--- Sistema de Contas ---");
	            System.out.println("1. Criar Conta");
	            System.out.println("2. Depositar");
	            System.out.println("3. Sacar");
	            System.out.println("4. Consultar Saldo");
	            System.out.println("5. Listar Contas");
	            System.out.println("6. Sair");
	            System.out.print("Escolha uma opção: ");
	            int opcao = scanner.nextInt();
	            scanner.nextLine(); // Consumir o newline
	            
	            switch (opcao) {
	                case 1:
	                    criarConta();
	                    break;
	                case 2:
	                    depositar();
	                    break;
	                case 3:
	                    sacar();
	                    break;
	                case 4:
	                    consultarSaldo();
	                    break;
	                case 5:
	                    listarContas();
	                    break;
	                case 6:
	                    continuar = false;
	                    System.out.println("Obrigado por usar o sistema de contas!");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
	            }
	        }
	        
	        scanner.close();
	    }

	    public static void main(String[] args) {
	        SistemaContas sistema = new SistemaContas();
	        sistema.executar();
	    }
	}
}	