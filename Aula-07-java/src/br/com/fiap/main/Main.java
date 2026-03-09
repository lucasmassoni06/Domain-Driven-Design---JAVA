package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;
import br.com.fiap.bean.Televisor;

public class Main {
    public static void main(String[] args) {

        // Teste de um objeto da classe Televisor

        Televisor tv = new Televisor();
        tv.volume = 7;
        tv.canal = 5;
        tv.trocarCanal(4);
        tv.diminuirVolume();
        tv.diminuirVolume();
        System.out.printf("Volume: %d\nCanal: %d", tv.volume, tv.canal);

        // Teste de um objeto da classse ArCondicionado

        ArCondicionado ar = new ArCondicionado();
        ar.temperatura = 25;
        ar.modo = "ventilar";
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.trocarModo("resfriar");
        String mensagem = String.format("Temperatura: %d C\nModo: %s", ar.temperatura, ar.modo);
        System.out.println(mensagem);
    }
}
