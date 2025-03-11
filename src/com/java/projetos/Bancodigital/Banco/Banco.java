package com.java.projetos.Bancodigital.Banco;
import java.util.Scanner;
import com.java.projetos.Bancodigital.Banco.usuario.Usuario;
public class Banco {
    public void cadastrarUsuario(){
        Usuario usuario = new Usuario();
        Scanner scanner = new Scanner(System.in);
        Scanner nomeUsuario = new Scanner(System.in);
        Scanner cpfUsuario = new Scanner(System.in);

        int conta = scanner.nextInt() ;
        System.out.println(conta);

    }
}
