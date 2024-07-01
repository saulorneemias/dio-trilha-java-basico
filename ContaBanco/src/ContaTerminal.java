import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta. Ex: '1234'");
        int numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Agência. Ex: '123-4");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente. Ex: 'Fulano da Silva Sousa'");
        String nomecliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo. Ex: 1234,5");
        double saldo = scanner.nextDouble();

        // Código para a mensagem de conta criada com sucesso
        String mensagem = "Olá " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                        + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque!";
        
        // Exibição da mensagem de conta criada com sucesso
        System.out.println(mensagem);

        scanner.close();
    }
}
