import java.util.Scanner;

public class Cliente {
    Scanner scanner = new Scanner(System.in);
    private String nome, email, senha, cpf;

    public Cliente() {
        System.out.println("----- CADASTRO BANCARIO -----");
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Senha: ");
        senha = scanner.nextLine();
        System.out.print("CPF: ");
        cpf = scanner.nextLine();

        System.out.println("----- BANCO DO BRASIL -----");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
        System.out.println("---------------------------");

        login();
    }

    private void login() {
        System.out.println("---- LOGIN BANCO DO BRASIL ----");
        while (true) {
            System.out.print("Email: ");
            String emailLogin = scanner.nextLine();
            System.out.print("Senha: ");
            String senhaLogin = scanner.nextLine();

            if (emailLogin.equals(email) && senhaLogin.equals(senha)) {
                System.out.println("Login realizado com sucesso! Bem-vindo(a), " + nome + "!");
                break;
            } else {
                System.out.println("Dados incorretos! Tente novamente.\n");
            }
        }
    }
}
