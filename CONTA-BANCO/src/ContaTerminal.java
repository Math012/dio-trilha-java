import service.ContaService;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaService contaService = new ContaService();


        System.out.println("Por favor, digite o número ! ");
        contaService.setNumero(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência ! ");
        contaService.setAgencia(scanner.nextLine());

        System.out.println("Por favor, digite o seu nome ! ");
        contaService.setNomeCliente(scanner.nextLine());


        System.out.println("Por favor, digite o seu saldo ! ");
        contaService.setSaldo(scanner.nextDouble());

        System.out.println(("Olá "
                + contaService.getNomeCliente()
                + ", obrigado por criar uma conta em nosso banco,"
                + " sua agência é "
                + contaService.getAgencia()
                + ", conta "+contaService.getNumero()
                +" e seu saldo "+contaService.getSaldo()
                +" já está disponível para saque"));
    }
}