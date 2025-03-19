package com.java.projetos.Bancodigital.Banco.usuario;

import com.java.projetos.Bancodigital.Banco.contaBanco.Conta.tipoConta.Conta;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String cpf;
    private String nome;
    private int id;
    private int numeroConta;
    public List<Conta> contas;

    public Usuario(String cpf, String nome, List<Conta> contas) {
        this.cpf = cpf;
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", id=" + id +
                ", numeroConta=" + numeroConta +
                '}';
    }

    public List<Conta> getContas() {
        return contas;
    }


    public void adicionarConta(Conta conta){
        if(!conta.equals(null)){
            contas.add(conta);
            System.out.println("Conta "+ conta.getNumeroConta());
        }
        else {
            System.out.println("Conta inválida!");
        }
    }

    public void removerConta(Conta conta){
        if(contas.remove(conta)){
            System.out.println("Conta "+ conta + " Removida!");
        }
        else {
            System.out.println("Conta não encontrada!");
        }
    }

    public void listarContas(){
        System.out.println("Contas do cliente "+ nome+ ":");
        for (Conta conta : contas){
            System.out.println("Numero da conta: "+ conta.getNumeroConta() + " | Saldo: "+ conta.getSaldo());
        }
    }
}
