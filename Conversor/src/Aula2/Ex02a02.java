package Aula2;

import java.util.Arrays;

public class Ex02a02 {



        public static void main (String[]args){
            int[] numbers = {5, 4, 1, 2, 3};
            int[] ascendingOrder = sortAscendingOrder(numbers);
            int[] descendingOrder = sortDescendingOrder(numbers);
            //int[] evenNumbers = filterEvenNumbers(ascendingOrder);
            //int[] oddNumbers = filterOddNumbers(ascendingOrder);

            System.out.println(Arrays.toString(numbers));
            System.out.println(Arrays.toString(ascendingOrder));
            System.out.println(Arrays.toString(descendingOrder));
            //System.out.println(Arrays.toString(evenNumbers));
            //System.out.println(Arrays.toString(oddNumbers));


        }
        public static int[] swap (int [] numbers, int i, int j){
            int[] numerosTrocados = numbers.clone();

            int aux = numerosTrocados[i];
            numerosTrocados[i]=numerosTrocados[j];
            numerosTrocados[j]=aux;
            return numerosTrocados;
        }

        public static int[] sortAscendingOrder ( int numbers[]){
            int[] numbersCrescente = numbers.clone();
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers.length; j++) {
                    if (numbersCrescente[i] < numbersCrescente[j]) {
                        numbersCrescente= swap(numbersCrescente, i, j);
                    }
                }
            }
            return numbersCrescente;
        }
        public static int[] sortDescendingOrder ( int numbers[]){
            int[] numbersDecrescente = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers.length-1; j++) {
                    if (numbersDecrescente[i] < numbersDecrescente[j]) {
                        numbersDecrescente=swap(numbersDecrescente, i, j);
                    }
                }
            }
            System.out.println(Arrays.toString(numbersDecrescente));
            return (numbersDecrescente);
        }
    }




