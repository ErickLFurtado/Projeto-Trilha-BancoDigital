import com.java.projetos.Bancodigital.Banco.contaBanco.Conta.tipoConta.Conta;
import com.java.projetos.Bancodigital.Banco.contaBanco.Conta.tipoConta.ContaCorrente;
import com.java.projetos.Bancodigital.Banco.contaBanco.Conta.tipoConta.ContaPoupanca;
import com.java.projetos.Bancodigital.Banco.usuario.Usuario;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Parte do usuario
        Usuario user1 = new Usuario(null, null, null);
        Scanner nomeUsuario = new Scanner(System.in);
        Scanner cpfUsuario = new Scanner(System.in);
        Scanner idUsuario = new Scanner(System.in);
        Scanner numeroConta = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = nomeUsuario.nextLine();
        System.out.println("Digite seu cpf: ");
        String cpf = cpfUsuario.nextLine();
        System.out.println("Digite o seu id: ");
        int id = idUsuario.nextInt();
        int numeroDaConta = numeroConta.nextInt();

        user1.setNome(nome);
        user1.setCpf(cpf);
        user1.setId(id);
        user1.setNumeroConta(numeroDaConta);

        user1.listarContas();
        System.out.println("=====================================");
        // Parte das contas
        ContaCorrente cc1 = new ContaCorrente(0, user1.getNome(), user1.getNumeroConta());
        ContaPoupanca cp1 = new ContaPoupanca(0, user1.getNumeroConta(), user1.getNome());

        user1.adicionarConta(cc1);
        user1.listarContas();
        cc1.depositar(100);
        cc1.consultarSaldo();
        cc1.sacar(20);
        cc1.consultarSaldo();

        user1.adicionarConta(cp1);
        user1.listarContas();
        cp1.depositar(250);
        cp1.consultarSaldo();
        cp1.sacar(20);
        cp1.consultarSaldo();




    }
}