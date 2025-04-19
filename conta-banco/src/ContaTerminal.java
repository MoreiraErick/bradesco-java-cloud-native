import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Criando o objeto scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, informe o código da agência: ");
        String agencia = sc.next();

        System.out.println("Informe o número da conta: ");
        int conta = sc.nextInt();

        System.out.println("Nome completo: ");
        String nomeCompleto = sc.next();
      
        double saldo = 100000.99;


        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                           + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
