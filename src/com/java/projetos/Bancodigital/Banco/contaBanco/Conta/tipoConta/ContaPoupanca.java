package com.java.projetos.Bancodigital.Banco.contaBanco.Conta.tipoConta;

public class ContaPoupanca extends Conta{
    private double taxaRendimento;
    private double saldoPoupanca;

    public ContaPoupanca(double saldo, int numeroConta, String titular) {
        super(saldo, numeroConta, titular);
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = super.getSaldo();
    }

    @Override
    public double depositar(double deposito) {
        if (deposito > 0){
            setSaldo(getSaldo() + deposito);
            System.out.println("O valor de " + deposito + " foi depositado com sucesso!");
            System.out.println("---------------");
            System.out.println("Novo saldo: " + getSaldo());
            return getSaldo();
        }
        else {
            System.out.println("Valor invalido");
        }
        return getSaldo();
    }

    @Override
    public double sacar(double saque) {
        if (saque > 0){
            setSaldo(getSaldo() - saque);
            System.out.println("O valor de "+ saque+ " foi retirado de sua conta!");
            System.out.println("---------------");
            System.out.println("Novo saldo: " + getSaldo());
            return getSaldo();
        }
        else {
            System.out.println("Valor de saque invalido");}
        return getSaldo();
    }

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo na conta poupanca é: "+ getSaldo());
    }
}
