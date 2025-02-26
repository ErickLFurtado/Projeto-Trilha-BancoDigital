package commo.java.projetos.Bancodigital.Banco;
import java.util.Scanner;
import commo.java.projetos.Bancodigital.Banco.usuario.usuario;
public class Banco {
    public void cadastrarUsuario(){
        usuario usuario = new usuario();
        Scanner scanner = new Scanner(System.in);
        Scanner nomeUsuario = new Scanner(System.in);
        Scanner cpfUsuario = new Scanner(System.in);

        int conta = scanner.nextInt() ;
        System.out.println(conta);

    }
}
