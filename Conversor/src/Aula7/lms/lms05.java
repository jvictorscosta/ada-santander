package Aula7.lms;

import com.sun.jdi.Value;

public class lms05 {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,67,89};
        System.out.println(parImpar(input));

    }
    public static String parImpar(int[] input) {
        String parImpar = "";
        int countPar=0;
        int countImpar=0;
        for(int i =0;i< input.length;i++){
            if(input[i]%2==0){
                countPar++;
            }else{countImpar++;}
        }
        parImpar = String.valueOf(countPar)+" pares, "+String.valueOf(countImpar)+" ímpares";
        return parImpar;
    }

}
