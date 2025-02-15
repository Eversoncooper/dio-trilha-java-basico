import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    String agencia;
    String nomeCliente;
    double saldo;

           //Exibir as mensagens para o usuário
           //Obter pela scanner os valores digitados no terminal 
           Scanner sc = new Scanner(System.in);
           System.out.println("Por favor, digite o número da agência: ");
           agencia = sc.nextLine();
        
           System.out.println("Por favor, digite o nome do cliente: ");
           nomeCliente = sc.nextLine();
        
           System.out.println("Por favor, digite o saldo inicial: ");
           saldo = sc.nextDouble();

           //Obter pela scanner os valores digitados no terminal
           System.out.println("Seja bem-vindo " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " e seu saldo " + saldo + " já está disponível para saque.");

           sc.close();
    }
}
