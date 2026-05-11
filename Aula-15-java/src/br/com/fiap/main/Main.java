package br.com.fiap.main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        do {
            try {
                int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha sua mensagem: \n1.Pergunta \n2. Informação \n3.Aviso \n4. Erro"));
                switch (opcao){
                    case 1:
                        JOptionPane.showMessageDialog(null, "Mensagem de Pergunta", "Pergunta", JOptionPane.QUESTION_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Mensagem de Informação", "Informação", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Mensagem de Aviso", "Aviso", JOptionPane.WARNING_MESSAGE);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Mensagem de Erro", "Erro", JOptionPane.ERROR_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }while(JOptionPane.showConfirmDialog(null,
                "Deseja continuar?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
                ) == 0);
    }
}
