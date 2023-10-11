public class Teste {
    public static void main(String[] args) {
      double[] precos = {89.99, 120.49, 75.0, 99.99, 149.99, 199.99, 69.99};

      double soma = 0;
      for (int i = 0; i < 7; i++){
          soma = soma + precos[i];
      }
      double media = soma / 7;
      System.out.println("Preço médio dos produtos:" + media);
    }
}
