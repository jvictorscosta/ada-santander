package Exercicio6;

import static java.lang.Math.sqrt;

public class triangulo {
    public static void main(String[] args) {
        double area = calcularArea(9, 7, 14);
        System.out.println(area);

    }
    public static double calcularArea(int a, int b, int c){
        double varP= (a+b+c)/2 ;
        System.out.println(varP);
        double areaTriangulo= sqrt(varP*(varP-a)*(varP-b)*(varP-c));

        return areaTriangulo;
    }
    public static boolean verificarTriangulo(int a, int b, int c){
        boolean triangulo=false;
        if (((a + b) > c) &((a + c) > b) & ((b + c) > a)){
            triangulo = false;
        }

       return triangulo;
    }
}
