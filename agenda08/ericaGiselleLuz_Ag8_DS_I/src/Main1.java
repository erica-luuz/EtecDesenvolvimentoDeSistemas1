import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numDeEntrevistados = 40;
        int idade, totalIdade = 0;
        double mediaIdade = 0;
        int quantOpiniaoOtimo = 0;
        double porcentagem = 0.0, quantOpiniaoPessimo = 0.0;
        int contador = 0, contadorIdade = 0;
        String opiniao;

        do {
            System.out.println("Digite sua idade:");
            idade = scan.nextInt();
            scan.nextLine();
            System.out.println("Digite sua opinião em relaçao ao filme, onde: " +
                    "A - Ótimo, " +
                    "B - Bom, " +
                    "C - Regular, " +
                    "D - Ruim, " +
                    "E - Péssimo");
            opiniao = scan.nextLine();

            if (opiniao.equalsIgnoreCase("A")){
                quantOpiniaoOtimo = quantOpiniaoOtimo + 1;
            } else if (opiniao.equalsIgnoreCase("B")) {
                System.out.println();
            } else if (opiniao.equalsIgnoreCase("C")) {
                System.out.println();
            } else if (opiniao.equalsIgnoreCase("D")) {
                totalIdade = totalIdade + idade;
                contadorIdade = contadorIdade + 1;
            } else if (opiniao.equalsIgnoreCase("E")) {
                quantOpiniaoPessimo = quantOpiniaoPessimo + 1;
            }else {
                System.out.println("Opinião Inválida");
            }
            contador++;
        }while (contador < numDeEntrevistados);
        if (contadorIdade != 0) {
            mediaIdade = totalIdade / contadorIdade;
        }
        if (quantOpiniaoPessimo != 0) {
            porcentagem = (quantOpiniaoPessimo / numDeEntrevistados) * 100;
        }

        System.out.println(quantOpiniaoOtimo +" responderam Ótimo!!");
        System.out.println("A média de idade das pessoas que responderam 'Ruim' é: " + mediaIdade);
        System.out.println(porcentagem + "% responderam Péssimo!");
    }
}