package Exercicio4;

public class Ex0201 {
    public static void main(String[] args) {
        //Maria tem uma frutaria e está com uma promoção para quem comprar mais de 10 frutas (LMS)
        System.out.println(custoCompra(12.0));

        }
    public static double custoCompra(double input) {
        double output;
        if(input > 10){
            output = input*1.25;
        } else {
            output = input*1.45;
        }
        System.out.printf("%.2d",output);
        return output;

    }
}
