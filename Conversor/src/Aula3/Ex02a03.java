package Aula3;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Ex02a03 {
    public class Solution {

            public static double[] custosCarro(double[] input) {
            double[] output = new double[2];
            output[0]= arredondar(input[1]*100/input[0]);
            output[1]= arredondar(input[2]*100/input[0]);
            return output;



        }
        }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }
}
