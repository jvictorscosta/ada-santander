package Aula6lsm;

public class Ex04a06 {
    public static void main(String[] args) {
        int [] input = {1,2,2,5,5};
        System.out.println(numeroUnico(input));
    }
    public static int numeroUnico( int[] input) {
        int numeroUnico=-1;
        int count=0;

        for(int i=0;i<input.length;i++){
            for(int j=0;j<input.length;j++) {
                if (input[i] == input[j]) {
                    count++;
                }
            }
            if(!(count>1)){
                numeroUnico=input[i];
            }
            count=0;
        }
        return numeroUnico;
    }}