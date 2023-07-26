package Aula7;
import java.util.Scanner;
//Retornar Enum do dia da semana para qualquer variavel de Domingo, utilizando um Array.
public class Ex01a07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Semana semana;
        String diaProcurado;

        System.out.println("Gentileza digitar o dia que deseja procurar");
        diaProcurado= scanner.nextLine();

        try{
            semana = (Semana) semana(diaProcurado.toLowerCase());
            System.out.println(semana);

        }
        catch (IllegalArgumentException e){
            System.out.println(diaProcurado+" não encontrado!");
        }
    }
    public static Enum<Semana> semana(String nome){
         return Semana.ArrayParaEnum(nome);


    }
}
