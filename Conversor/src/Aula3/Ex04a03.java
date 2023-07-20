package Aula3;

public class Ex04a03 {
    public static void main(String[] args) {
        System.out.println(primeiroCaractereUnico("Bolacha"));

    }
    public static int primeiroCaractereUnico(String input) {
        int[] count = new int[20];
        for (int i = 0; i < input.length(); i++) {
            char caractere = input.charAt(i);
            count[caractere - 'a']++;
        }


        for (int i = 0; i < input.length(); i++) {
            char caractere = input.charAt(i);
            if (count[caractere - 'a'] == 1) {
                return i;
            }
        }

        return -1;

    }
}

