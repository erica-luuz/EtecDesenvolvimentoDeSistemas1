import javax.swing.*;

public class SomaDdigitos {
    public static void main(String[] args) {
        //declaração de variáveis
        int num, soma;
        //entrada de dados
        num = Integer.parseInt(JOptionPane.showInputDialog("Entre com numero de 2 algoritimos: "));
        //salvo o valor das unidades
        soma = num % 10;
        //calculo a soma das dezenas, centenas, etc
        while (num > 0 ){
            num /= 10;
            soma = soma + (num % 10);
        } //fim da repetição
        //saida de dados
        JOptionPane.showMessageDialog(null, soma);
    }
}
