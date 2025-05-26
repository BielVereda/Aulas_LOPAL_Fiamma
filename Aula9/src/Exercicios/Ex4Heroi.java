package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Heroi {
	String nome;
	int forca, inteligencia, velocidade;

	Heroi(String nome, int forca, int inteligencia, int velocidade) {
		this.nome = nome;
		this.forca = forca;
		this.inteligencia = inteligencia;
		this.velocidade = velocidade;
	}

	int poderTotal() {
		return forca * 2 + inteligencia * 3 + velocidade;
	}
}

public class Ex4Heroi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Heroi> herois = new ArrayList<>();

		System.out.print("Quantos heróis deseja cadastrar? ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("\nCadastro do herói " + (i + 1) + ":");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Força: ");
			int forca = sc.nextInt();
			System.out.print("Inteligência: ");
			int inteligencia = sc.nextInt();
			System.out.print("Velocidade: ");
			int velocidade = sc.nextInt();
			sc.nextLine();
			herois.add(new Heroi(nome, forca, inteligencia, velocidade));
		}

		Collections.sort(herois, new Comparator<Heroi>() {
			public int compare(Heroi a, Heroi b) {
				return b.poderTotal() - a.poderTotal();
			}
		});

		System.out.println("\n=== Ranking de Super-Heróis ===");
		for (int i = 0; i < herois.size(); i++) {
			Heroi h = herois.get(i);
			System.out.printf("%dº - %s | Poder Total: %d\n", i + 1, h.nome, h.poderTotal());
		}
	}
}