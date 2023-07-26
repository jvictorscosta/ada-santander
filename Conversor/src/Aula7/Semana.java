package Aula7;

public enum Semana {

        DOMINGO( new String[]{"Domingo","Doming","dom","dmng"}),
        SEGUNDA( new String[]{"Segunda","Segund","Seg","segunda-feira"});
        /*TERCA("Terça-feira"),
        QUARTA("Quarta-feira"),
        QUINTA("Quinta-feira"),
        SEXTA("Sexta-feira"),
        SABADO("Sábado");*/

    private final String[] palavrasChave;

        Semana(String[] palavrasChave) {
            this.palavrasChave = palavrasChave;
        }

        public String[] getpalavrasChave(){
            return palavrasChave;
        }

        public static Semana ArrayParaEnum(String palavrasChave) {
            for (Semana dia : values()) {
               for(String s : dia.getpalavrasChave())
                if (s.equalsIgnoreCase(palavrasChave)) {
                    return dia;
                }
            }
            throw new IllegalArgumentException("Dia inválido!");
        }

}
