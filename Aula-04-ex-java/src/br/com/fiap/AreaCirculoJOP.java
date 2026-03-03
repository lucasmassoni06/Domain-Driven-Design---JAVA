package br.com.fiap;

import javax.swing.*;

public class AreaCirculoJOP {
    public static void main(String[] args) {
        double raio, area;
        String auxiliar;
        final double PI = 3.1415;

        try{
            auxiliar = JOptionPane.showInputDialog("Digite a medida do raio: ");
            raio = Float.parseFloat(auxiliar);
            area = Math.PI * Math.pow(raio, 2);
            JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite um valor de raio válido!");
        }
    }
}
