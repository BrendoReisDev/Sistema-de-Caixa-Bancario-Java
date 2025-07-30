import java.util.Scanner;

public class Transacao  {
    Scanner scanner = new Scanner(System.in);
    private double saldo;

    public Transacao() {
        this.saldo = 200.0;

    }
    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$" + valor + "realizado");
        } else {
            System.out.println("Valor invalido para deposito");
        }

    }
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo ){
            saldo -= valor;
            System.out.println("Saque realizado " + valor + "R$" + "\nSaldo final:" +saldo + "R$");
        } else {
            System.out.println("Saldo insuficiente ou valor invalido");
        }
    }
public void mostraDados(){
    System.out.println("------- EXTRATO SALDO ---------");
    System.out.println("Saldo: "+saldo+"R$");

}
    }
