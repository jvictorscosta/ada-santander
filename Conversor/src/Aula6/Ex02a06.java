package Aula6;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import Aula6.Estado;

//Uma empresa vende o mesmo produto para 3 diferentes estados. Cada estado possui uma taxa diferente de imposto sobre o produto (MG 7%; SP 12%; RJ 15%;).
// Faça um programa que recebe o valor do produto e o estado de destino do produto e, então,
// calcule o preço final do produto acrescido do imposto baseado no estado em que ele será vendido.
//
//Considerar as seguintes restrições quanto a entrada e saída dos dados: arredondamento de 4 casas no valor final do produto
public class Ex02a06 {

    public static void main(String[] args) throws EstadoInvalidoException, Aula6.EstadoInvalidoException {

        System.out.println(valorProdutoFinal(250.10, "MG") == 267.607);
        System.out.println(valorProdutoFinal(250.10, "RJ") == 287.615);
        System.out.println(valorProdutoFinal(250.10, "SP") == 280.112);

        try {
            valorProdutoFinal(250.10, "DF");
        } catch (IllegalArgumentException e) {
            throw new Aula6.EstadoInvalidoException("Estado inválido");
        }
    }


    public static double valorProdutoFinal(double valorProduto, String estadoDestino) throws EstadoInvalidoException {
        return arredondar(valorProduto * (Estado.valueOf(estadoDestino).getTaxa()));
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }
    public class EstadoInvalidoException extends Exception{
        public EstadoInvalidoException(String msg){
            super(msg);
    }

}
}
