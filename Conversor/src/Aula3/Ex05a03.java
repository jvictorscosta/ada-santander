package Aula3;

import java.util.Arrays;

public class Ex05a03 {
    public static void main(String[] args) {
        double[] input = {2.5, 3, 2.5, 6, 8};
        System.out.println(elementoRepetido(sortAscendingOrder(input)));
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(sortAscendingOrder(input)));
    }

    public static boolean elementoRepetido(double[] input) {
        for (int i = 0; i < input.length - 1; i++) {
                if (input[i] == input[i+1]) {
                    return true;
        }
    }
        return false;
    }

    public static double[] sortAscendingOrder(double[] numbers) {
        double[] numbersCrescente = numbers.clone();
        double temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length-1; j++) {
                if (numbersCrescente[j] > numbersCrescente[j + 1]) {
                    temp=numbersCrescente[j];
                    numbersCrescente[j]=numbersCrescente[j+1];
                    numbersCrescente[j+1]=temp;


                }
            }

        }
        return numbersCrescente;
    }
}