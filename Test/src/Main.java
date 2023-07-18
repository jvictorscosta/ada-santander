import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double[] input = {121000,14350,21450};

            double[] output = new double[2];
            output[0]= Math.round(input[1]*10000/input[0]) ;
            output[1]= Math.round(input[2]*10000/input[0]) ;

        System.out.println(output[0]);
        System.out.println(output[1]);


    }
}