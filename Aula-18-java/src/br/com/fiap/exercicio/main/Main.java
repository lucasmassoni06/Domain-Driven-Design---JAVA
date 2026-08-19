package br.com.fiap.exercicio.main;

import javax.swing.*;

import br.com.fiap.exercicio.bean.Calculadora;
import br.com.fiap.exercicio.main.Main;

public class Main {
    static void main() {
        Calculadora calculadora = new Calculadora();
        try {
            calculadora.setNumero1(Float.parseFloat(JOptionPane.showInputDialog("Digite um número: ")));
            calculadora.setNumero2(Float.parseFloat(JOptionPane.showInputDialog("Digite mais um número: ")));
            do {
                int escolha = Integer.parseInt(JOptionPane.showInputDialog("Qual metodo você deseja:\n1.Adição \n2.Subtração \n3.Multiplicação \n4.Divisão"));
                switch (escolha) {
                    case 1:
                        escolha = (int) calculadora.adicao(calculadora.getNumero1(), calculadora.getNumero2());
                        break;
                    case 2:
                        escolha = (int) calculadora.subtracao(calculadora.getNumero1(), calculadora.getNumero2());
                        break;
                    case 3:
                        escolha = (int) calculadora.multiplicacao(calculadora.getNumero1(), calculadora.getNumero2());
                        break;
                    case 4:
                        if (calculadora.getNumero1() != 0 || calculadora.getNumero2() != 0){
                            escolha = (int) calculadora.divisao(calculadora.getNumero1(), calculadora.getNumero2());
                        } else {
                            JOptionPane.showMessageDialog(null, "Divisão não pode ser feita com 0");
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Número inválido");
                }
                JOptionPane.showMessageDialog(null, "O resultado é: " + escolha);
            } while(JOptionPane.showConfirmDialog(null, "Deseja continuar? ", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        }finally {
            JOptionPane.showMessageDialog(null, "Fim de Programa!");
        }
    }
}
