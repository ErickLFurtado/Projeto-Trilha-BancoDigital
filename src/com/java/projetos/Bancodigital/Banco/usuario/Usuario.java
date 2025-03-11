package com.java.projetos.Bancodigital.Banco.usuario;

public class Usuario {
    private String cpf;
    private String nome;
    private double aniverario;
    private int idade;
    private int conta;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
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

    public double getAniverario() {
        return aniverario;
    }

    public void setAniverario(double aniverario) {
        this.aniverario = aniverario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



}
