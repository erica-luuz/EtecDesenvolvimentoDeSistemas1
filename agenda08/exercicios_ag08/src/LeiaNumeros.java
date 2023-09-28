import java.util.Scanner;

public class LeiaNumeros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int contador = 0;
        int somaNum = 0;
        double media = 0;

        do {
            System.out.println("Entre com o " + (contador + 1) + "° numero:");
            num = scan.nextInt();
            somaNum = somaNum + num;
            contador++;
        } while (contador < 10);
            media = somaNum / 10;
            System.out.println("A média é: " + media);

    }
}
