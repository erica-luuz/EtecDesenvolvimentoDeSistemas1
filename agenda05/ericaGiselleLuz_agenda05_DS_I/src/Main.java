import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.println("Digite a idade do usuário:");
        idade = scan.nextInt();

        if( idade >= 80 ){
            System.out.println("Cliente de fila 80+");
        }else if ( idade >= 60 ){
            System.out.println("Cliente de fila prioritária");
        }else {
            System.out.println("Cliente de fila comum");
        }

    }
}