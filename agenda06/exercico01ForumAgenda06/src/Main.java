import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroPedido;

        System.out.println("Sistema de Gerenciamento de Pedidos");
        System.out.println("Digite o numero do serviço: " +
                             "1 para Entrada," +
                             "2 para Prato Principal, " +
                             "3 para Sobremesa," +
                             "4 para Bebida");
        numeroPedido = scan.nextInt();

        switch (numeroPedido) {
            case 1 :
                System.out.println("O tempo estimado para a Entrada é: 10 minutos." );
                break;
            case 2:
                System.out.println("O tempo estimado para o Prato Prinicpal é: 20 minutos.");
                break;
            case 3:
                System.out.println("O tempo estimado para a Sobremesa é: 15 minutos.");
                break;
            case 4:
                System.out.println("O tempo estimado para a Bebida é: 5 minutos.");
                break;
            default:
                System.out.println("Numero Digitado inválido!");
        }
    }
}