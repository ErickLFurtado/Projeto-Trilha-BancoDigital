package commo.java.projetos.Bancodigital.Banco.usuario;

import java.util.Date;

public class usuario {
    private String cpf;
    private String nome;
    private Date aniverario;
    private int idade;
    private int conta;

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
}
