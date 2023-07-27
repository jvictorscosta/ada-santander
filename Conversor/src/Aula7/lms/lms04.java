package Aula7.lms;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class lms04 {
    public static void main(String[] args) {
        double[] pedrinhoInfo={5,800000.00,1500.00,50};//carros vendidos, total vendido, salario fixo, fixo por carro.
        System.out.println(salarioComComissao(pedrinhoInfo));
    }
    public static double salarioComComissao( double[] input) {
        double salarioPedrinho=(input[0]*input[3]+input[2]+input[1]*0.05);

        return arredondar(salarioPedrinho);
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }
}
