package br.com.fiap.bean;

import java.time.LocalDate;

public class Funcionario {
    private String Funcionario;
    private float valorHoradeTrabalho;
    private LocalDate dataNascimento;

    public Funcionario(String funcionario, float valorHoradeTrabalho, LocalDate dataNascimento) {
        Funcionario = funcionario;
        this.valorHoradeTrabalho = valorHoradeTrabalho;
        this.dataNascimento = dataNascimento;
    }

    public float getValorHoradeTrabalho() {
        return valorHoradeTrabalho;
    }

    public void setValorHoradeTrabalho(float valorHoradeTrabalho) {
        this.valorHoradeTrabalho = valorHoradeTrabalho;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float calcularSalario(){
        return (valorHoradeTrabalho);
    };
}
