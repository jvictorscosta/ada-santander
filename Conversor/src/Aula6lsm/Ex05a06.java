package Aula6lsm;

//As condições da promoção dizem que, na compra
//de duas peças, será dado 50% de desconto na peça de menor de valor.
//
//Escreva uma função que receba um array contendo o preço das peças de um
//cliente e calcule o valor total sem descontos, o valor total de descontos,
//e o valor total a pagar. A saída da função deve ser uma string.
public class Ex05a06 {
    public static void main(String[] args) {
        double[] input = {20.0, 80.0, 60.0, 40.0};
        System.out.println(avaliacao(input));
    }
    public static String avaliacao(double[] input) {
        double vTotal=0;
        double vDesconto=0;
        double vPago=0;
        //somar total da compra
        for (int i=0;i< input.length;i++){
            vTotal=vTotal+input[i];

        }


        //calcular desconto
        input = sortAscendingOrder(input);
        double qtdDesconto= Math.floor(input.length/2);
        for(int i=0;i<qtdDesconto;i++){
            vDesconto=vDesconto+(input[i]*0.5);


        }

        //total a pagar
        vPago=vTotal-vDesconto;

        return ("Valor total: "+vTotal+" | Valor de descontos: "+vDesconto+" | Valor a pagar: "+vPago);
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
