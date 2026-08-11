package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;

public class PokemonComStream {
    static void main(){
        HashMap<String, String> mapa = new HashMap<>();
        do {
            try{
                String pokemon, tipo;
                do {
                    tipo = JOptionPane.showInputDialog(null, "Digite o tipo do seu Pokemon ou digite \"fim\" para finalizar").toUpperCase();
                    if (!tipo.equals("FIM")){
                        pokemon = JOptionPane.showInputDialog(null, "Digite o nome do seu pokemon");
                        if (mapa.containsKey(tipo)){
                            if (mapa.get(tipo).contains(pokemon)){
                                JOptionPane.showConfirmDialog(null, "Esse pokemon ja foi registrado!");
                            }
                        } else {
                            mapa.put(tipo, pokemon);
                        }
                    }

                } while(!tipo.equals("FIM"));

                String

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0);

    }
}
