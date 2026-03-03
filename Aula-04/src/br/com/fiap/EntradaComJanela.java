package br.com.fiap;

import javax.swing.*;

public class EntradaComJanela {
    public static void main(String[] args) {
        int num1, num2, resultado;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite um número"); // input no modo janela
            num1 = Integer.parseInt(auxiliar); // converter a String auxiliar para int
            auxiliar = JOptionPane.showInputDialog("Digite outro número");
            num2 = Integer.parseInt(auxiliar);
            resultado = num1 + num2;
            JOptionPane.showMessageDialog(null, "Valor 1: " + num1 + "\nValor 2: " + num2 + "\nA soma dos valores: " + resultado);
            // é necessario o null para indicar onde vai abrir a janela
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto");
        }
    }
}
