package Aula6lsm;

public class Ex03a06 {
    public static void main(String[] args) {
        int [] input = {5,4,14};
        System.out.println(idadeEmDias(input));
    }
    public static int idadeEmDias( int[] input) {
        int anos=input[0];
        int meses=input[1];
        int dias = input[2];
        int totalDias=anos*365+meses*30+dias;

        return totalDias;
    }
}
