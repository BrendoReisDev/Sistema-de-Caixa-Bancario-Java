import java.util.Scanner;

public class ContaBancaria extends Transacao {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            Transacao transacao =  new Transacao();
            System.out.println("""
                ----------- BANCO ---------------
                | [1] Entrar no Banco           |
                | [0] Sair                      |
                ---------------------------------
                Escolha uma opção: """);

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Cliente cliente = new Cliente();
                    int opcao2 = 0;

                        System.out.println("""
                                ------------ BANCO --------------
                                | [1] Sacar                     | 
                                | [2] Depositar                 |
                                | [3] Saldo                     |
                                | [0] Sair                      |
                                ---------------------------------
                                Escolha uma opção: """);
                        opcao2 = scanner.nextInt();
                        switch (opcao2) {
                            case 1:
                                System.out.println("Digite o valor do saque: ");
                                double valorSaque = scanner.nextDouble();
                                transacao.sacar(valorSaque);
                                break;
                            case 2:
                                System.out.println("Digite o valor do deposito: ");
                                double valorDeposito = scanner.nextDouble();
                                transacao.deposito(valorDeposito);

                            case 3:
                                transacao.mostraDados();
                                break;

                        }

                  break;
                case 0:
                    System.out.println("Obrigado por usar o sistema!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
            }
        }


