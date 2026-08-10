package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;

public class PokemonHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<String, String>();
        do {
            try {
                String tipo, pokemon;
                do {
                    tipo = JOptionPane.showInputDialog(null, "Digite o tipo do seu pokemon ou digite \"fim\" para finalizar").toUpperCase();

                    if (!tipo.equals("FIM")) {
                        pokemon = JOptionPane.showInputDialog(null, "Digite o nome do seu pokemon: ");

                        if (mapa.containsKey(tipo)) {

                            if (mapa.get(tipo).contains(pokemon)) {
                                JOptionPane.showConfirmDialog(null, "Esse pokemon ja foi registrado!");
                            } else {
                                mapa.put(tipo, mapa.get(tipo) + ", " + pokemon);
                            }

                        } else {
                            mapa.put(tipo, pokemon);
                        }

                    }

                } while (!tipo.equals("FIM"));

                String mostrar = JOptionPane.showInputDialog("Qual tipo deseja vizualizar?");

                if (mapa.containsKey(mostrar.toUpperCase())) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Do tipo " + mostrar + " tem os seguintes pokemons: \n" + mapa.get(mostrar.toUpperCase())
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