import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o saldo inicial
        System.out.print("Digite o saldo inicial da conta: ");
        double saldoFinal = scanner.nextDouble();
        
        // Realiza três transações de depósito
        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o valor da " + i + "ª transação: ");
            double transacao = scanner.nextDouble();
            saldoFinal += transacao;
        }
        
        // Exibe o saldo final
        System.out.println("Saldo final da conta: " + saldoFinal);
        
        scanner.close();
    }
}