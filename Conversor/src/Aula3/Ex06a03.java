package Aula3;

import static java.lang.Math.sqrt;

public class Ex06a03 {
    public static void main(String[] args) {
        double area = calcularArea(9, 7, 14);
        System.out.println(area);

    }
    public static double calcularArea(int a, int b, int c){
        if(verificarTriangulo(a,b,c)){
        double varP= (a+b+c)/2 ;

        double areaTriangulo= sqrt(varP*(varP-a)*(varP-b)*(varP-c));

        return areaTriangulo;}

        else{
            throw new IllegalArgumentException("whatever");
        }

    }
    public static boolean verificarTriangulo(int a, int b, int c){
        return (((a + b) > c) &((a + c) > b) & ((b + c) > a));
    }
}
