package Aula4;

public class Ex03a04c {
    public static void main(String[] args) {
        double[][] entradas = {
                {8.0, 7.0, 8.0, 8.0},
                {5.0, 4.3, 8.0, 7.0},
                {2.0, 5.0, 8.0, 6.0},
                {4.0, 1.0, 9.0, 7.0},
                {2.0, 2.0, 10.0, 1.0},
                {2.9, 2.5, 10.0, 7.1},
                {4.4, 4.1, 8.5, 9.5},
                {5.0, 7.0, 9.0, 8.0},
                {8.0, 7.0, 8.0, 9.0},
                {8.0, 8.0, 10.0, 9.0},
                {2.0, 2.0, 5.0, 1.0}
        };

        String[] saidas = {
                "B",
                "C",
                "C",
                "D",
                "D",
                "C",
                "C",
                "B",
                "B",
                "A",
                "D"
        };

        for (int i = 0; i < entradas.length; i++) {
            String resultado = mediaAproveitamento(entradas[i]);
            String esperado = saidas[i];

            System.out.println("Resultado: " + resultado);
            System.out.println("Esperado: " + esperado);
            System.out.println(resultado.equals(esperado));
            System.out.println();
        }
    }

    public static String mediaAproveitamento(double[] input) {
         String nota;
         double notaTotal = (input[0]+input[1]*2+input[2]*3+input[3])/7;
        if(notaTotal<=6){
            nota ="D";
        }else if(notaTotal<=7.5){
            nota ="C";
        }else if(notaTotal<9){
            nota ="B";
        }else {
            nota ="A";
        }

return nota;
    }
}
