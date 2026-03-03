package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

public class main {
    public static void main(String[] args) {
        FolhaDePagamento dindin = new FolhaDePagamento();
        dindin.salarioBruto = 100000;
        dindin.numeroDeDependentes = 3;
        dindin.descontoINSS = 0.11;
        dindin.valorPlanoDeSaude = 1000;
        dindin.calcularSalarioLiquido();
        System.out.println("Salário liquido é de: " + dindin.calcularSalarioLiquido());
    }
}
