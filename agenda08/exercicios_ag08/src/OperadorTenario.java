public class OperadorTenario {
    public static void main(String[] args) {
        boolean fimDeSemana = true;
        boolean taChovendo = false;
        boolean vamosAPraia = fimDeSemana && taChovendo;

        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
    }
}
