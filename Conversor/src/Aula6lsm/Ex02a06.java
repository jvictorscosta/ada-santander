package Aula6lsm;

public class Ex02a06 {
    public static void main(String[] args) {
        int [] input = {2,2,5};
        System.out.println(eUmTriangulo(input));

    }
    public static boolean eUmTriangulo(int[] input) {
        int a = input[0];
        int b = input[1];
        int c = input[2];

        return (((a + b) > c) & ((a + c) > b) & ((b + c) > a));
    }
}
