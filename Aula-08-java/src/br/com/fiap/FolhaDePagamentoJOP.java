package br.com.fiap;

import javax.swing.*;
import java.awt.*;

public class FolhaDePagamentoJOP {
    public static void main(String[] args) {
        String auxiliar,resultado;
        double bruto,inss,plano,salarioinss,saude,liquido;
        int dependentes = 1;
        try{
            auxiliar = JOptionPane.showInputDialog("Qual é o seu salário bruto: ");
            bruto = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Número de dependentes: ");
            dependentes += Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Valor do desconto INSS: ");
            inss = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Valor do Plano de Saúde: ");
            plano = Float.parseFloat(auxiliar);

            salarioinss = bruto * inss;
            saude = dependentes * plano;
            liquido = bruto - (salarioinss + saude);
            resultado = String.format("O salário liquido é: %.2f,%nO salário bruto é de: %.2f,%nO desconto do INSS é de: %.2f,%nO valor do plano de saúde é de %.2f,%nO número de dependetes é de: %d ", liquido, bruto, inss, plano, dependentes);
            JOptionPane.showMessageDialog(null, resultado);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null,"Digite um valor válido!");
        }
    }
}
