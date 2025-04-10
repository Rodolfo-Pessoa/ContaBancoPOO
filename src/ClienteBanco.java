import java.util.Scanner;
import java.util.Locale;
import ContaBanco.ContaConta;

public class ClienteBanco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaConta p1 = new ContaConta();
        p1.setNumConta(1234);
        p1.setDono("João");
        p1.abrirConta("CC");
        p1.depositar(650);

        p1.estadoAtual();

        System.out.println("_________________________");

        ContaConta p2 = new ContaConta();

        p2.setNumConta(5678);
        p2.setDono("Maria");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        p2.sacar(5000);

        p2.estadoAtual();

        sc.close();
    }
}