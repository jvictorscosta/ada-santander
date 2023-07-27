package Aula7;

public class lms02 {
    public static void main(String[] args) {
        System.out.println(geraSequenciaFibonacci(0));

    }
    public static String geraSequenciaFibonacci(int input) {

    if(input==0){
        return "0";
    }
    int a=0;
    int b=1;
    int c;
    String fibonacci="0";

    for(int i =0; i<input;i++) {
        c = a + b;
        a=b;
        b=c;

       fibonacci = fibonacci+ ", "+ String.valueOf(a);

        if(c>input){
            return fibonacci;
        }
    }
    return fibonacci;

    }

}
