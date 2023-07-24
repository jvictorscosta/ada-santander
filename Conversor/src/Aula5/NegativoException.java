package Aula5;

public class NegativoException extends Exception {
    public NegativoException(){
        super();
        System.out.println("Quantidade informada é negativa.");

    }
    public NegativoException(String msg){
        super(msg);  System.out.println("Item zerado");
    }


}
