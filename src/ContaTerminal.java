
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite seu nome!");
            String nome = scanner.nextLine();

            System.out.println("Por favor, digite o número da Agência!");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o número da Conta!");
            int conta = scanner.nextInt();

            System.out.println("Por favor, digite o valor para depósito inicial!");
            double saldo = scanner.nextDouble();

            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
        }
    }
}
