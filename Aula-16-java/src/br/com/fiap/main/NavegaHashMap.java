package br.com.fiap.main;

import java.util.HashMap;
import java.util.Map;

public class NavegaHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> pessoa = new HashMap<String, Integer>();
//  Implementa a interface Map usando uma tabela de hash para armazenar pares chave-valor
        pessoa.put("Astrogildo", 18);
        pessoa.put("Berisvaldo", 25);
        pessoa.put("Gumercindo", 18);
        for (Map.Entry<String, Integer> valor : pessoa.entrySet()) {
            System.out.println("Chave: " + valor.getKey() + "\tValor " + valor.getValue());
        }
    }
}