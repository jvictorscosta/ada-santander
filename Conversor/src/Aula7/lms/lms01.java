package Aula7.lms;

import java.util.Arrays;

public class lms01 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(soletrandoStr("cuzcuz")));
    }
    public static String[] soletrandoStr(String input) {
        String[] soletrando= new String[input.length()];

        for(int i = 0;i<input.length();i++){
            soletrando[i]= String.valueOf(input.charAt(i));
        }


        return soletrando;
    }
}
