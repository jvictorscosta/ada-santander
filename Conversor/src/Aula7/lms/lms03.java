package Aula7.lms;

import java.util.Arrays;

//No dia a dia é comum trabalhar com conjuntos de dados e em casos específicos é
// necessário usar algum padrão de organização para melhor entender os dados.
// Como exemplo, podemos citar uma chamada em classe, geralmente, esse procedimento segue o padrão da ordem alfabética, uma forma de ordenação.
//
//Crie uma função que que recebe um conjunto de dados (inteiros),
// faz a ordenação dos dados de forma crescente e retorna o conjunto dos dados ordenados.
// A função deverá ser criada seguindo a estrutura abaixo:
public class lms03 {
    public static void main(String[] args) {
        int [] input = {14,51,2,31,4,6,8,12};
        System.out.println(Arrays.toString(ordenar(input)));
    }
    public static int[] ordenar(int[] input) {
        for (int i=0;i< input.length;i++){
            for (int j=0;j<input.length;j++){
                int auxTemp=0;
                if(input[i]<input[j]){
                    auxTemp=input[i];
                    input[i]=input[j];
                    input[j]=auxTemp;
                                  }
            }
        }

        return input;
    }

}
