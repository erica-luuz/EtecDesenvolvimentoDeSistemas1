import java.util.Scanner;

public class ComparacaoNumeros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = 2; // iniciando a variavel com valor
        int num;
        int maior;
        int compara = 10;

        System.out.println("Insira o primeiro numero: ");
        maior = scan.nextInt();

        while (x <= compara) { // laço de repetição while
            System.out.println("Digite " + x + "numero");
            num = scan.nextInt();
            if (num > maior) { //decisão
                maior = num;
            }
            x++;
        }
        System.out.println("O maior numero digitado foi: " + maior);
    }
}