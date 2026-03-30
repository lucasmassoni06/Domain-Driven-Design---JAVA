package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;

import java.time.LocalDate;

public class mainFunc1 {
    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Astrogildo");
        funcionario1.setValorHoraTrabalho(15.75f);
        LocalDate dataAtual = LocalDate.now();
        System.out.printf("Data de hoje: %d/%s/%d\nNome: %s\nSalario: R$ %.2f",dataAtual.getDayOfMonth(),dataAtual.getMonth(),dataAtual.getYear(),funcionario1.getNome(),funcionario1.calcularSalario(20));
    }
}
