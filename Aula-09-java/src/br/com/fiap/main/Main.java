package br.com.fiap.main;

import br.com.fiap.bean.Radio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        Scanner scan;
        int volume;
        float estacao;
        try{
            scan = new Scanner(System.in);
            System.out.println("Digite um volume");
            volume = scan.nextInt();
            System.out.println("Digite um estação");
            estacao = scan.nextFloat();

            radio.setVolume(volume);
            radio.setEstacao(estacao);

            radio.aumentarVolume();
            radio.aumentarVolume();
            radio.aumentarVolume();

            System.out.printf("Voume: %d \n Estação: %.1f", radio.getVolume(), radio.getEstacao());
        } catch (Exception e) {
            System.out.println("Formato inválido!");
        }
    }
}
