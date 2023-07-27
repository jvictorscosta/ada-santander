package Aula7;

public class Ex02a07 {
    public static void main(String[] args) {
        System.out.println(somar(3));
        System.out.println(somar2(2));
        System.out.println(multi(4));

    }
    public static int somar(int limite){

        int soma = 0;

        for (int i = 1; i<= limite; i++){
            soma +=i;

        }
        return soma;
    }
    public static int somar2(int limite){
        if(limite ==0){
            return 0;
        }

        return limite + somar2(limite-1);
    }
    public static int multi(int limite){
        if(limite==0){
            return 0;
        }
        return limite * multi(limite-1);
    }
}
