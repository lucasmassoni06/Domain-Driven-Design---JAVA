package br.com.fiap.aula.bean;

import br.com.fiap.aula.bean.exceptions.SaldoInsuficienteException;

public class ContasBancarias {
    private double saldo;

    public ContasBancarias(){

    }

    public ContasBancarias(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double quantia) throws SaldoInsuficienteException {
        if (quantia > saldo) {
            throw new SaldoInsuficienteException("Saldo Insuficiente oara realizar o saque");
        }
        saldo -= quantia;
    }

}
