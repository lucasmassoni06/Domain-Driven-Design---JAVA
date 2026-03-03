package br.com.fiap;

import java.util.Scanner;

public class IdadeScanner {
    public static void main(String[] args) {
        int ano, anoniver, idade;
        Scanner scan;
        try{
            scan = new Scanner(System.in);
            System.out.println("Digite que ano estamos: ");
            ano = scan.nextInt();
            System.out.println("Digite em que ano você nasceu; ");
            anoniver = scan.nextInt();
            idade = ano - anoniver;
            System.out.println("Você tem: " + idade);
        } catch (Exception e) {
            System.out.println("Digite um ano válido!");
        }
    }
}
