package br.com.fiap.aula.bean.main;

import br.com.fiap.aula.bean.ContasBancarias;
import br.com.fiap.aula.bean.exceptions.SaldoInsuficienteException;

public class MainContaBancaria {
    static void main(){
        ContasBancarias conta = new ContasBancarias(5000);

        System.out.println("Saldo: " + conta.getSaldo());
        try {
            conta.sacar(1000);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Saldo Atual: " + conta.getSaldo());
    }
}
