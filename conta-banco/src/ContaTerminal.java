import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Por favor, digite o número da agência");
            String agencia = sc.nextLine();

            System.out.println("Por favor, digite o número da sua conta");
            int numeroConta = sc.nextInt();

            System.out.println("Por favor, digite seu nome completo");
            String nomeCliente = sc.next();

            System.out.println("Por favor, digite o valor que deseja sacar");
            double saldo = sc.nextDouble();

            System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta" + numeroConta + " e seu saldo de " + saldo
                    + " já está disponível para saque");
        }
    }
}
