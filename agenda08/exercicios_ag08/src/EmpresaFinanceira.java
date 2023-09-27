import java.util.Scanner;

//, um programa de uma empresa financeira. Nele, o usuário informa seu cargo e
//salário e, a partir dessas informações, o programa informa quanto de empréstimo a pessoa pode obter.
//diretor=30%, gerente=25%, operacional=20%
public class EmpresaFinanceira {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, cargo;
        float sal, emprestimo;

        System.out.println("Por favor informe seu nome");
        nome = scan.nextLine();
        System.out.println("E agora informe seu cargo (Diretor, Gerente ou Operacional");
        cargo = scan.nextLine();

        while (!cargo.equals("Operacional") && !cargo.equals("Diretor") && !cargo.equals("Gerente")) {
            System.out.println("Cargo incorreto, por favor informe o cargo novamente");
            cargo = scan.nextLine();
        }

        System.out.println("Agora informe o seu salário");
        sal = scan.nextFloat();
        if (cargo.equals("Gerente")){
            emprestimo = sal * 25 / 100;
        } else if (cargo.equals("Diretor")){
            emprestimo = sal * 30 / 100;
        } else {
            emprestimo = sal * 20 / 100;
        }
        System.out.println("Olá " + nome);
        System.out.println("Seu cargo é " + cargo);
        System.out.println("Seu salário é :" + sal);
        System.out.println("Olá " + nome);
        System.out.println("E você tem direito a pegar R$" + emprestimo + " de empréstimo");

    }
}
