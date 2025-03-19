package com.java.projetos.Bancodigital.Banco.contaBanco.Conta.tipoConta;

public class ContaCorrente extends Conta{
    private double saldoCorrente;
    private double limiteDoChequeEspecial;

    public ContaCorrente(double saldo, String titular, int numeroConta,double limiteDoChequeEspecial ){
        super(saldo, numeroConta, titular);
        this.limiteDoChequeEspecial = limiteDoChequeEspecial;
    }

    public ContaCorrente(double saldo, String titular, int numeroConta){
        super(saldo, numeroConta, titular);
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
        return getSaldo();
    }

    @Override
    public double sacar(double saque) {
        if (saque > 0){
            setSaldo(getSaldo() - saque);
            System.out.println("O valor de " + saque + " foi depositado com sucesso!");
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
    public void consultarSaldo() {
        System.out.println("Seu saldo em conta é: "+ saldoCorrente);
    }
}
