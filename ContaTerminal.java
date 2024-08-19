import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new  Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja bem vindo ao seu Banco Tech!\n");

        System.out.println("Digite o número da sua agência - Exemplo: AG: 0004");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta - Exemplo: AG: 123456");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite valor á ser depositado");
        Double saldo = scanner.nextDouble();        

        System.out.println("Olá Sr(a) " + nome + " " + sobrenome +  "\n" + " sua conta de nº: " + numeroConta + " agência nº " + agencia + "\n" + " teve um depósito de R$" + saldo);
    }
}
