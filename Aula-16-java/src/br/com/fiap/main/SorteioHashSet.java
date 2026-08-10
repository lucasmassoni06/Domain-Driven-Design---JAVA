package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class SorteioHashSet {

    public static void main(String[] args) {
        HashSet<Integer> numerosSorteados = new HashSet<Integer>();
        Random random = new Random();

        do {
            JOptionPane.showMessageDialog(
                    null,
                    "Confira a seguir os resultados do sorteio da Loteria da Sorte Premiada!",
                    "Loteria",
                    JOptionPane.INFORMATION_MESSAGE
            );

            while (numerosSorteados.size() < 6) {
                int numero = random.nextInt(59) + 1;
                numerosSorteados.add(numero);
            }

            ArrayList<Integer> resultadosDoSorteios =
                    new ArrayList<Integer>(numerosSorteados);

            Collections.sort(resultadosDoSorteios);

            JOptionPane.showMessageDialog(
                    null,
                    "Os numeros sorteados são: \n" + resultadosDoSorteios
            );

            numerosSorteados.clear();

        } while (
                JOptionPane.showConfirmDialog(
                        null,
                        "Deseja continuar?",
                        "Atenção",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE
                ) == JOptionPane.YES_OPTION
        );

        JOptionPane.showMessageDialog(
                null,
                "Fim do Programa!",
                "Adeus",
                JOptionPane.WARNING_MESSAGE
        );
    }
}