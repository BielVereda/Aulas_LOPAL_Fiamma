package AulaSete;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        int[] numeros = generateRandomArray(10, 1, 100);
        
        int somaTotal = sumArray(numeros);
        
        System.out.print("Números gerados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("Soma total: " + somaTotal);
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = min + random.nextInt(max - min + 1);
        }
        return array;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
