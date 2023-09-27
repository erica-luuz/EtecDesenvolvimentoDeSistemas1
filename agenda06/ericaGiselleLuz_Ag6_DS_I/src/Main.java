import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numFinalPlaca;

        System.out.println("**** Despachante Vale Card ***");
        System.out.println("Digite o numero Final da Placa de seu veículo:");
        numFinalPlaca = scan.nextInt();
        switch (numFinalPlaca) {
            case 1:
                System.out.println("Pagamento até 30 de Abril");break;
            case 2:
                System.out.println("Pagamento até 31 de Maio");break;
            case 3:
                System.out.println("Pagamento até 30 de Junho");break;
            case 4:
                System.out.println("Pagamento até 31 de Julho");break;
            case 5:
                System.out.println("Pagamento até 31 de Agosto");break;
            case 6:
                System.out.println("Pagamento até 30 de Setembro");break;
            case 7:
                System.out.println("Pagamento até 31 de Outubro");break;
            case 8:
                System.out.println("Pagamento até 30 de Novembro");break;
            case 9:
            case 0:
                System.out.println("Pagamento até 31 de Dezembro");break;
            default: System.out.println("Numero digitado incorreto!!");
        }
        scan.close();
    }
}