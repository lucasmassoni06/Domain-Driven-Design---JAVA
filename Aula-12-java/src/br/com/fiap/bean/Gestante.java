package br.com.fiap.bean;

import jdk.jshell.spi.ExecutionControl;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Gestante {
    private String nome;
    private LocalDate dataDaGestacao;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDaGestacao() {
        return dataDaGestacao;
    }

    public void setDataDaGestacao(LocalDate dataDaGestacao) {
        try{
            if (dataDaGestacao.isAfter(LocalDate.now().minusMonths(9))){
                this.dataDaGestacao = dataDaGestacao;
            }else{
                throw new Exception("Data de gestação inválida");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
    }

    public Gestante(String nome, LocalDate dataDaGestacao) {
        this.nome = nome;
        this.dataDaGestacao = dataDaGestacao;
    }

    public int tempoDeGestacao(){
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataDaGestacao, dataAtual);
        return periodo.getMonths();
    }
}
