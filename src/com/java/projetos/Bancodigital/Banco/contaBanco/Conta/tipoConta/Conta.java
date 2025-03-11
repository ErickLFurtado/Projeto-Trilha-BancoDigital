package com.java.projetos.Bancodigital.Banco.contaBanco.Conta.tipoConta;

public abstract class Conta {
    private int numeroConta;
    private double saldo;
    private  String titular;

    public Conta(double saldo, int numeroConta, String titular) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    abstract double depositar(double deposito);
    abstract double sacar(double saque);

    public void consultarSaldo(){
        System.out.println(saldo);
    }

}
