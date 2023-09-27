import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int quantidadeEntrevistados = 50;
        int idade;
        int opiniao;
        int opiniao1Excelente = 0;
        int opiniao2Bom = 0;
        int opiniao3Ruim = 0;

        for (int i = 0; i < quantidadeEntrevistados; i++) {

            System.out.println("Digite o nome do " + (i+1) + "º entrevistado:");
            nome = scan.nextLine();
            System.out.println("Digite a idade do " + (i+1) + "º entrevistado:");
            idade = scan.nextInt();
            System.out.println("Digite sua opinião: 1-para EXCELENTE, 2-para BOM, 3-para RUIM");
            opiniao = scan.nextInt();

            String nome2 = scan.nextLine();

            if (opiniao == 1){
                opiniao1Excelente = opiniao1Excelente + 1;
            }else if (opiniao == 2) {
                opiniao2Bom = opiniao2Bom + 1;
            }else if (opiniao == 3)  {
                opiniao3Ruim = opiniao3Ruim + 1;
            } else {
                System.out.println("Valor inválido");
            }
        }
        System.out.println("A quantidade de respostas EXCELENTES foram: " + opiniao1Excelente);
        System.out.println("A quantidade de respostas RUIM forma: " + opiniao3Ruim);
    }
}






