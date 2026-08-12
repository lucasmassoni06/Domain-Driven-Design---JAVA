package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class PokemonComStream {
    static void main() {
        //Cria lista pokemon
        HashMap<String, String> listaPokemon = new HashMap<>();

        //Cria o tipo e o nome do pokemon
        String tipo, pokemon;

        //Menu QUER CRIAR MAIS ALGUM POKEMON
        do {
            tipo = JOptionPane.showInputDialog("Qual o tipo do seu pokemon?");
            pokemon = JOptionPane.showInputDialog("Qual o nome do seu pokemon?");
            if (listaPokemon.containsKey(pokemon)){
                JOptionPane.showMessageDialog(null, "Esse pokemon ja foi adicionado!");
            } else {
                listaPokemon.put(tipo, pokemon);
            }

        }while (JOptionPane.showConfirmDialog(null, "Deseja Continuar? ", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0);
        String escolha;
        do{
            escolha = JOptionPane.showInputDialog("Qual tipo deseja vizualizar?");
            if (listaPokemon.containsKey(escolha)){
                JOptionPane.showMessageDialog(null, "O tipo escolhido foi " + escolha + " E tem os seguintes pokemons" + listaPokemon.c;
            }else{
                JOptionPane.showMessageDialog(null, "Tipo de pokemon não existente!");
            }
        }while (listaPokemon.containsKey(escolha));
        JOptionPane.showMessageDialog(null, "FIM");
    }
}

