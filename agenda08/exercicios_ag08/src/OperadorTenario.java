public class OperadorTenario {
    public static void main(String[] args) {
        boolean fimDeSemana = true;
        boolean taChovendo = false;
        boolean vamosAPraia = fimDeSemana && taChovendo;

        // Tabela Verdade
        // Operador && (AND)
        /* true && true = true
           true && false = false
           false && true = false
           false && false = false
         */

        /* Operador || (OR)
            true || true = true
            true || false = true
            false || true = true
            false || false= false
         */

        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
    }
}
