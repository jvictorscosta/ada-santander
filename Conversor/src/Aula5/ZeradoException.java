package Aula5;

public class ZeradoException extends Exception {
    public ZeradoException(){
        super();
    }
    public ZeradoException(String msg){
        super(msg);
        System.out.println("Quantidade informada é igual a 0.");
    }
}
