package Aula1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fª ");
        double entrada = scanner.nextDouble();

        System.out.printf("%.2f Fª em Cº é igual a %.2f",entrada,converterTemp(entrada));
        scanner.close();

    }
    public static double converterTemp(double fahrenheit){
        double celsius = 5 * ((fahrenheit - 32) / 9);
        return (celsius);
    };

}