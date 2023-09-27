import javax.swing.JOptionPane;
public class GameLacoRepita {
    public static void main(String[] args) {
        String palavra, resposta;
        int vezes = 1;

        palavra = JOptionPane.showInputDialog("Digite a palavra S.E.C.R.E.T.A.: ");

        do {
            resposta = JOptionPane.showInputDialog("Tentativa: "+ vezes + "\nAdivinhe a palavra S.E.C.R.E.T.A.");
            vezes++;
            if (palavra.equals(resposta)){
                vezes = 10;
            }

        }while (vezes <=5);

        if (vezes == 10){
            JOptionPane.showMessageDialog(null, "PARABÉNS! Você acertou");
        }else {
            JOptionPane.showMessageDialog(null, "Que pena, você perdeu! A palavra secreta era: " + palavra);
        }


    }
}
