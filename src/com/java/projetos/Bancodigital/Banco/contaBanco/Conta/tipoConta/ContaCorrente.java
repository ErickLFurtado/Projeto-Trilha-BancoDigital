package com.java.projetos.Bancodigital.Banco.contaBanco.Conta.tipoConta;

public class ContaCorrente extends Conta{
    private double saldoCorrente;

    public ContaCorrente(double saldo, String titular, int numeroConta ){
        super(saldo, numeroConta, titular);
    }

    @Override
    double depositar(double deposito) {
        saldoCorrente = saldoCorrente + deposito;
        return saldoCorrente;
    }

    @Override
    double sacar(double saque) {
        saldoCorrente = saldoCorrente - saque;
        return saldoCorrente;
    }


}
