import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numeroAgencia;
        String agencia, nomeUsuario;
        float saldo;

        System.out.println("Informe o número da agência:");
        numeroAgencia = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe o nome da agência:");
        agencia = sc.nextLine();
        System.out.println("Informe o nome do cliente:");
        nomeUsuario = sc.nextLine();
        System.out.println("Informe o saldo:");
        saldo = sc.nextFloat();

        sc.close();

        System.out.println("Olá " + nomeUsuario+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia + ", conta " + numeroAgencia+ " e seu saldo "+ saldo+ " já está disponível para saque");
    }
}