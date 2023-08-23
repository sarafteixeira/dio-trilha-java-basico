import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME SEUS DADOS");

        System.out.print("NÚMERO: ");
        int numero = Integer.parseInt(sc.nextLine());

        System.out.print("AGÊNCIA: ");
        String agencia = sc.nextLine();


        System.out.print("CLIENTE: ");
        String nomeCliente = sc.nextLine();

        System.out.print("SALDO: ");
        double saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nomeCliente
                        + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                        + ", conta " + numero
                        + " e seu saldo " + saldo
                        + " já está disponível para saque.");
    }
}
