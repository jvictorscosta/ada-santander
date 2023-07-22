package Aula5;

import java.util.Scanner;

public class Ex01a05c {
    public static void main(String[] args) {


    double totalDaCompra=0.0;
        System.out.println("---------Bem vindos a Frutaria da Maria-------------");
        System.out.println("Estamos em promoção das frutas Peras,Laranja,Maça,Tomate,Caqui");
        String[] Frutas ={"Pera", "Laranja","Maça","Tomate","Caqui" };

        for(int i=0;i<5;i++){
        System.out.println("Digite a quantidade que deseja de "+Frutas[i]);
        Scanner scanner = new Scanner(System.in);
        double quantidade = scanner.nextDouble();
        try {
            validarCompraPositiva(quantidade);
        }catch (NegativoException e){}

        //try {validarQuantidadeMaiorQueZero(quantidade);}
        //catch (ZeradoException e){}

        totalDaCompra=totalDaCompra+valorFruta(quantidade);
        System.out.println(quantidade+" "+Frutas[i]+" saindo a um total de " + valorFruta(quantidade));
        System.out.printf("\n\nAté o momento o total da compra está em %.2f\n",totalDaCompra);
        scanner.nextLine();
    }   System.out.printf("\n\nAgradecemos as compras o valor total foi de %.2f\n",totalDaCompra);
}
    public static double valorFruta(double qtd){
        double totalFruta;
        if(qtd<10){
            totalFruta= qtd*1.45;
            return(totalFruta);
        }else{
            totalFruta= qtd*1.25;
            return(totalFruta);
        }
    }
    //Validade se é menor que zero
    public static void validarCompraPositiva(double quantidade) throws NegativoException {
        if(quantidade<0){
            throw new NegativoException ();
        }
    }
    //public static void validarQuantidadeMaiorQueZero(double quantidade) throws ZeradoException {
    //    if(quantidade == 0){
    //        throw new ZeradoException("Quantidade Zerada");
    //    }
    //}
}
