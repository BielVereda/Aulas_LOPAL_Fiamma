package AulaSete;

import javax.swing.JOptionPane;

public class Desafio9 {
	

	    public static void main(String[] args) {
	        double[] notas = new double[6];
	        
	        for (int i = 0; i < 6; i++) {
	            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + (i + 1)));
	        }
	        
	        double media = calcularMedia(notas);
	        
	        JOptionPane.showMessageDialog(null, "Notas: " + exibirNotas(notas) + "\nMédia: " + media);
	        
	        if (media >= 7) {
	            JOptionPane.showMessageDialog(null, "Resultado: Aprovado");
	        } else {
	            JOptionPane.showMessageDialog(null, "Resultado: Reprovado");
	        }
	    }
	    
	    public static double calcularMedia(double[] notas) {
	        double soma = 0;
	        for (double nota : notas) {
	            soma += nota;
	        }
	        return soma / notas.length;
	    }
	    
	    public static String exibirNotas(double[] notas) {
	        StringBuilder sb = new StringBuilder();
	        for (double nota : notas) {
	            sb.append(nota).append(" ");
	        }
	        return sb.toString();
	    }
	}

}
