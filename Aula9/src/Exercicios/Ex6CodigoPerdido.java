package Exercicios;

public class Ex6CodigoPerdido {

	public static void main(String[] args) {
		String[] codigos = { "4H", "7A", "2C" };
		StringBuilder resultado = new StringBuilder();

		for (String c : codigos) {
			int num = Integer.parseInt(c.substring(0, c.length() - 1));
			char letra = c.charAt(c.length() - 1);
			for (int i = 0; i < num; i++) {
				resultado.append(letra);
			}
		}

		System.out.println("Código reconstruído: " + resultado);
	}
}