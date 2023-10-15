import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int valores [][] = new int [5][5];
        //Armazenando valores:
        for (int linha=0; linha < 5; linha++){
            for (int coluna=0; coluna < 5; coluna++){
                System.out.println("Digite um valor para linha: " + linha + " coluna: " +coluna);
                valores[linha][coluna]=scan.nextInt();
            }
        }
        // Percorrendo a matriz e somando os valores
        for (int linha=0; linha < 5; linha++){
            for (int coluna=0; coluna < 5; coluna++){
            soma = soma + valores[linha][coluna];
            }
        }
        System.out.println("O valor total da soma da matriz é: " + soma);
    }
}