package br.com.fiap;

import javax.swing.*;

public class MediaJOP {
    public static void main(String[] args) {
        float nota1,nota2,nota3,nota4,media;
        String auxiliar;
        try{
            auxiliar = JOptionPane.showInputDialog("Digite a primeira nota: ");
            nota1 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a segunda nota: ");
            nota2 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a terceira nota: ");
            nota3 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a quarta nota: ");
            nota4 = Float.parseFloat(auxiliar);
            media = (nota1 + nota2 + nota3 + nota4)/4;
            JOptionPane.showMessageDialog(null, "A média das notas " + nota1 + ", " + nota2 + ", "+ nota3 + " e "+ nota4 + " é: " + media);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Envie uma nota válida!");
        }
    }
}
