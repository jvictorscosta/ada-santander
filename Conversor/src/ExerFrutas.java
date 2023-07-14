import java.util.Scanner;

public class ExerFrutas {
    public void carrinhoDeCompras(){
        double totalDaCompra=0;
        System.out.println("Bem vindos a Frutaria da Maria");
        System.out.println("Estamos em promoção das frutas Peras,Laranja,Maça,Tomate,Caqui");
        String[] Frutas ={"Pera", "Laranja","Maça","Tomate","Caqui" };

        for(int i=0;i<5;i++){
            System.out.println("Digite que deseja de "+Frutas[i]);
            Scanner scanner = new Scanner(System.in);
            int quantidade = scanner.nextInt();
            totalDaCompra=totalDaCompra+valorFruta(quantidade);
            System.out.printf("Até o momento o total da compra está em %0.2d\n",totalDaCompra);




        }
        System.out.printf("Agradecemos as compras o valor total foi de %0.2d\n",totalDaCompra);
    }
    public double valorFruta(int qtd){
        double totalFruta;
        if(qtd<10){
            totalFruta= qtd*1.45;
            return(totalFruta);
        }else{
            totalFruta= qtd*1.25;
            return(totalFruta);
        }
    }
}
