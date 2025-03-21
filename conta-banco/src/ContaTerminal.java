
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe scanner

        //Exibir as mensagens para o usuário

        //Obter pela classe scanner os valores digitados no terminal

        //Exibir a mensagem criada
        

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("por favor digite o número da agência");
        int numero = scanner.nextInt();
        System.out.println("por favor digite o nome da agência");
        String agencia = scanner.next();
        System.out.println("por favor digite o nome do cliente");
        String cliente = scanner.next();
        System.out.println("por favor digite o saldo do cliente");
        double saldo = scanner.nextDouble();

        System.out.println("olá " + cliente + "sua agência é: " + agencia + "numero" + numero + "seu saldo é de: " + saldo);




    }
}
