package br.com.fiap;

import javax.swing.*;

public class IdadeJOP {
    public static void main(String[] args) {
        int ano,anoniver,idade;
        String auxiliar;
        try{
            auxiliar = JOptionPane.showInputDialog("Digite o ano em que estamos: ");
            ano = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o ano em que você nasceu: ");
            anoniver = Integer.parseInt(auxiliar);
            idade = ano - anoniver;
            JOptionPane.showMessageDialog(null, "Você tem: " + idade + " anos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite um ano válido!");
        }
    }
}
