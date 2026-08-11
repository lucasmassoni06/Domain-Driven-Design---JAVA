package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class PokemonHashMap {
    public static void main(String[] args) {
        HashMap<String, String> pokemon = new HashMap<>();
        do {
            try {
                String tipo, nome;
                do {
                    nome = JOptionPane.showInputDialog(null, "Digite o nome do seu pokemon ou digite \"fim\" para finalizar").toUpperCase();

                    if (!nome.equals("FIM")) {
                        tipo = JOptionPane.showInputDialog(null, "Digite o tipo do seu pokemon: ").toUpperCase();

                        if (pokemon.containsKey(nome)) {
                                JOptionPane.showConfirmDialog(null, "Esse pokemon ja foi registrado!");
                        } else {
                            pokemon.put(nome, tipo);
                        }

                    }

                } while (!nome.equals("FIM"));

                String mostrar = JOptionPane.showInputDialog("Qual tipo deseja vizualizar?").toUpperCase();
                String nomesEncontrados = "";
                for (Map.Entry<String, String> entrada : pokemon.entrySet()) {
                    if (entrada.getValue().equals(mostrar)){
                        nomesEncontrados += entrada.getKey() + "\n";
                    }
                }

                if (!nomesEncontrados.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            null, "Do tipo " + mostrar + " tem os seguintes pokemons: \n" + nomesEncontrados
                    );
                } else {
                    JOptionPane.showMessageDialog(null, "Tipo não encontrado!", "Atenção!", JOptionPane.WARNING_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja Continuar? ", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Programa Encerrado!", "Atenção", JOptionPane.WARNING_MESSAGE);
    }
}