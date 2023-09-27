import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Locadora SPCar");

        Scanner scan = new Scanner(System.in);

        String modeloVeiculo;
        double valorDiaria;
        int quantDiasLocados;
        double valorTotalDiaria;
        int kmPercorridos;
        double valorPorKmPercorrido = 0.20;
        double valorTotalKmPercorridos;
        double valorTotalPagar;

        System.out.println("Digite o modelo do Carro:");
        modeloVeiculo = scan.nextLine();
        System.out.println("Digite o valor cobrado na diária:");
        valorDiaria = scan.nextDouble();
        System.out.println("Digite a quantidades de dias locados:");
        quantDiasLocados = scan.nextInt();
        System.out.println("Digite a quantidade de Kilometros percorridos:");
        kmPercorridos = scan.nextInt();

        valorTotalDiaria = valorDiaria * quantDiasLocados;
        valorTotalKmPercorridos = kmPercorridos * valorPorKmPercorrido;
        valorTotalPagar = valorTotalDiaria + valorTotalKmPercorridos;

        System.out.println("A locação do veiculo: " + modeloVeiculo + ", ficou no valor total de R$ " + valorTotalPagar);

    }
}