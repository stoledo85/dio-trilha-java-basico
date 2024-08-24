import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nome_do_cliente;
        Double saldo;
        // TODO:Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);
        // Exibir as mensagens para o usuario.
        System.out.println("Por Favor informe o número da conta:");
        numero = sc.nextInt();
        System.out.println("Informe a agência da conta:");
        agencia = sc.next();
        System.out.println("Informe o Nome:");
        nome_do_cliente = sc.next();
        System.out.println("Saldo a ser depositado:");
        saldo = sc.nextDouble();
        // Obter pela scanner os dados coletados no terminal.
        System.out.println("Olá " + nome_do_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
