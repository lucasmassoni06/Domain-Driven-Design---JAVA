package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa p1;
        String nome, dataNascimento;
        LocalDate minhaData;
        try {
            nome = JOptionPane.showInputDialog("Digite seu nome; ").toUpperCase();
            dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento:");

            p1 = new Pessoa();
            p1.setNome(nome);
            p1.setDataNascimento(LocalDate.parse(dataNascimento));

            JOptionPane.showMessageDialog(null, String.format("Nome: %s\n Data Nascimento: %s\nIdade: %d anos", p1.getNome(), p1.getDataNascimento(), p1.calcularIdade()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
