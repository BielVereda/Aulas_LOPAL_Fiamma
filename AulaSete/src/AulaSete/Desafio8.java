package AulaSete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio8 {
	

	    public static void main(String[] args) {
	        Integer[] originalVector = {12, 3, 7, 8, 9, 10, 14, 5, 18, 21};
	        List<Integer> originalList = Arrays.asList(originalVector);

	        List<Integer> evenNumbers = new ArrayList<>();
	        List<Integer> oddNumbers = new ArrayList<>();

	        for (Integer num : originalList) {
	            if (num % 2 == 0) {
	                evenNumbers.add(num);
	            } else {
	                oddNumbers.add(num);
	            }
	        }

	        System.out.println("Vetor original: " + originalList);
	        System.out.println("Números pares: " + evenNumbers);
	        System.out.println("Números ímpares: " + oddNumbers);
	    }
	}

}
