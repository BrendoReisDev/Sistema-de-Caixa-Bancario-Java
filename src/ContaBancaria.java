import java.util.Scanner;

public class ContaBancaria extends Transacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transacao transacao = new Transacao();

        while (true) {
            System.out.println("""
                ------------ BANCO --------------
                | [1] Entrar no Banco           |
                | [0] Sair                      |
                ---------------------------------
                Escolha uma opção: """);

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Cliente cliente = new Cliente();

                    int opcao2;
                    do {
                        System.out.println("""
                                ------------ BANCO --------------
                                | [1] Sacar                     | 
                                | [2] Depositar                 |
                                | [3] Ver Saldo                 |
                                | [0] Sair                      |
                                ---------------------------------
                                Escolha uma opção: """);
                        opcao2 = scanner.nextInt();

                        switch (opcao2) {
                            case 1:
                                System.out.print("Digite o valor do saque: ");
                                double valorSaque = scanner.nextDouble();
                                transacao.sacar(valorSaque);
                                break;
                            case 2:
                                System.out.print("Digite o valor do depósito: ");
                                double valorDeposito = scanner.nextDouble();
                                transacao.deposito(valorDeposito);
                                break;
                            case 3:
                                transacao.mostraDados();
                                break;
                            case 0:
                                System.out.println("Saindo da conta...");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }

                    } while (opcao2 != 0);

                    break;

                case 0:
                    System.out.println("Obrigado por usar o sistema!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
