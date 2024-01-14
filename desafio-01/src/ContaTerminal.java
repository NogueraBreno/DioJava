import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite a agência:");
        scanner.nextLine();  // Consume newline left-over
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite quanto quer depositar :");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta no Dio Bank , sua agência é" + agencia + ", conta " + numeroConta +  " e seu saldo " + saldo + " já está disponível para saque");
    }
}
