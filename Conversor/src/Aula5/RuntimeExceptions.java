package Aula5;

public class RuntimeExceptions {
    public static void main(String[] args) {

        int esperado =1;
        String valor = "2";
        try {
            int resultado = stringParaInteiro(valor);
            //System.out.println(esperado == resultado);
            int divisao = resultado/0;

        }catch (java.lang.NumberFormatException e) {
            System.out.println("Não é possível transformar " + valor + " em Inteiro.");
        }catch (ArithmeticException e){
            System.out.println("Não foi possivel dividir "+valor+ " por 0");
        }
    }
    public static int stringParaInteiro(String numero){
        return Integer.parseInt(numero);
    }
}
