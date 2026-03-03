package br.com.fiap;

import java.util.Scanner;

public class AreaCirculoScanner {
    public static void main(String[] args) {
        Scanner scan;
        double raio, area;
        final double PI = 3.1415;
        try {
            scan = new Scanner(System.in);
            System.out.println("Qual o raio do seu círculo? ");
            raio = scan.nextDouble();
            area = Math.PI * Math.pow(raio, 2);
            System.out.println("A área do círculo vale: " + area);
        } catch (Exception e) {
            System.out.println("Digite um raio válido!");
        }
    }
}
