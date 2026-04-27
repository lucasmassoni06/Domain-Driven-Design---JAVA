package br.com.fiap.main;

import br.com.fiap.bean.Quadrado;
import br.com.fiap.bean.Retangulo;
import br.com.fiap.bean.Triangulo;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        String auxiliar, escolha = "sim";
        float lado, altura, area;
        int opcao;
        while (escolha.equalsIgnoreCase("sim")){
            try{
                auxiliar = JOptionPane.showInputDialog("Qual area deseja calcular? \n 1. Quadrado\n2. Retangulo\n3.Triangulo");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao){
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite valor para o lado");
                        lado = Float.parseFloat(auxiliar);
                        Quadrado quad = new Quadrado(lado);
                        area = quad.calcularArea();
                        JOptionPane.showMessageDialog(null, "Área do Quadrado: " + area);
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite valor para o lado");
                        lado = Float.parseFloat(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Digite valor para a altura");
                        altura = Float.parseFloat(auxiliar);
                        Retangulo ret = new Retangulo(lado, altura);
                        area = ret.calcularArea();
                        JOptionPane.showMessageDialog(null, "Áre do Retangulo: " + area);
                        break;
                    case 3:
                        auxiliar = JOptionPane.showInputDialog("Digite valor para o lado");
                        lado = Float.parseFloat(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Digite valor para a altura");
                        altura = Float.parseFloat(auxiliar);
                        Triangulo tri = new Triangulo(lado, altura);
                        area = tri.calcularArea();
                        JOptionPane.showMessageDialog(null, "Area do triangulo: " + area);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Escolha um valor válido!");
                }
            escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de Programa");
    }
}
