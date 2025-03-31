package AulaSete;

public class Desafio6 {
	    public static void main(String[] args) {
	        int[] vetor = {2, 4, 6, 8, 10};
	        
	        System.out.print("Vetor original: ");
	        for (int num : vetor) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número para multiplicar: ");
	        int multiplicador = scanner.nextInt();
	        
	        for (int i = 0; i < vetor.length; i++) {
	            vetor[i] *= multiplicador;
	        }
	        
	        System.out.print("Novo vetor: ");
	        for (int num : vetor) {
	            System.out.print(num + " ");
	        }
	        
	        scanner.close();
	    }
	}

}
