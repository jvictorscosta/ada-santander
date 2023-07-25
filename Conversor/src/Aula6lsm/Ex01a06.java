package Aula6lsm;

// crie uma função que receba um array com as notas dos alunos
// (as três primeiras notas correspondem a N1, N2 e N3 e a última posição, a médias dos exercícios)
// e calcule a média de aproveitamento e retorne o conceito que o aluno obteve.

import java.util.Arrays;

public class Ex01a06 {
    public static void main(String[] args) {
        double[] input = {2.0,5.0,8.0,6.0};
        System.out.println(mediaAproveitamento(input));
        //System.out.println(Arrays.toString(input));

    }
    public static String mediaAproveitamento(double[] input) {
        double a =input[0];
        double b =input[1];
        double c =input[2];
        double d =input[3];
        double mediaAlunos = (a+b+c+d)/ input.length;
        System.out.println(mediaAlunos);
        if(mediaAlunos<6){
            return "D";
        } else if(mediaAlunos<7.5){
            return "C";
        } else if(mediaAlunos<9.0){
            return "B";
        } else {
            return "A";}
    }
}
