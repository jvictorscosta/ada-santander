package Aula5;

public class NegativoException extends Exception {
    public NegativoException(){
        super();
        System.out.println("Item zerado");

    }
    public NegativoException(String msg){
        super(msg);  System.out.println("Item zerado");
    }


}
