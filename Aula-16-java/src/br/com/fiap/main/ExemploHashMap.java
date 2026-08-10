package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<String, String>();
        do{
            try{
                String sigla, estado;
                do {
                    sigla = JOptionPane.showInputDialog("Digite o UF (Unidade Federal) de um estado ou digite \"fim\" para encerrar").toUpperCase();
                    if(!sigla.equals("FIM")) {
                        estado = JOptionPane.showInputDialog("Digite o nome completo do seu estado informado anteriormente");
                        if (mapa.containsKey(sigla)) {
                            JOptionPane.showConfirmDialog(null, "Esse Estado ja foi cadastrado!0");
                        } else {
                            mapa.put(sigla, estado);
                        }
                    }
                } while (!sigla.equals("FIM"));
                String escolha = JOptionPane.showInputDialog("Digite o UF de um estado de sua escolha").toUpperCase();
                if (mapa.containsKey(escolha)){
                    JOptionPane.showMessageDialog(null, "o nome completo desse estado é: " + mapa.get(escolha), "Nome do Estado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Estado não encontrado!", "Atenção!", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar? ", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
