package Aula5;

public class CheckedExceptions {
    // todas as exceptions que derivarem de RunTimeException não são Checked
    // As checked derivam indiretamente ou diretamente do Exception.
    public static void main(String[] args) {
        lerClasse("teste");
    }
    public static void lerClasse(String name) {
        try {
            Class.forName("");
        }catch (ClassNotFoundException e){
            System.out.printf("Classe '%s' não encontrada.",name);
        }

    }

}
