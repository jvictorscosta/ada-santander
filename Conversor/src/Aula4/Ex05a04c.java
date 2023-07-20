package Aula4;
//Crie uma função que recebe uma string e retorna o índice do primeiro caractere não repetido da string.
//Caso não exista caractere único na palavra em questão, retornar -1.
public class Ex05a04c {
    public static void main(String[] args) {
        String[] entradas = {
                "amor",
                "cocada",
                "mora",
                "ovo",
                "cachorro",
                "kaka",
                "saudades",
                "palalelepipedo",
                "fofocalizando",
                "papagaio",
                "ateiaateiab"
        };

        int[] saidas = {
                0,
                1,
                0,
                1,
                1,
                -1,
                2,
                9,
                4,
                4,
                10
        };

        for (int i = 0; i < entradas.length; i++) {
            double resultado = primeiroCaractereUnico(entradas[i]);
            double esperado = saidas[i];

            System.out.println("Resultado: " + resultado);
            System.out.println("Esperado: " + esperado);
            System.out.println(resultado == esperado);
            System.out.println();
        }
    }

    public static int primeiroCaractereUnico(String input) {
        // Faça utilizando for
        int localLetraUnica = -1;
        boolean repetiu =false;

        for (int i = 0; i <= input.length()&& localLetraUnica==-1; i++){

            for (int j = 0;j<input.length() && repetiu==false;j++) {
                if(input.charAt(i)==input.charAt(j)&&(i!=j)){
                    localLetraUnica=input.charAt(i);
                    repetiu=true;
                }}
                  if(repetiu==false){
                      localLetraUnica =i;
                  }


            }


        return  localLetraUnica;
    }

}
