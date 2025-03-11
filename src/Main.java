import com.java.projetos.Bancodigital.Banco.contaBanco.Conta.tipoConta.Conta;
import com.java.projetos.Bancodigital.Banco.usuario.Usuario;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario erick = new Usuario();
        Scanner nomeUsuario = new Scanner(System.in);
        Scanner cpfUsuario = new Scanner(System.in);
        Scanner idUsuario = new Scanner(System.in);
        Scanner contaUsuario = new Scanner(System.in);
        Scanner aniversarioUsuario = new Scanner(System.in);

        String nome = nomeUsuario.nextLine();
        String cpf = cpfUsuario.nextLine();
        int id = idUsuario.nextInt();
        double nascimento = aniversarioUsuario.nextDouble();
        int conta = contaUsuario.nextInt();

        erick.setNome(nome);
        erick.setConta(conta);
        erick.setAniverario(nascimento);
        erick.setCpf(cpf);
        erick.setId(id);





    }
}