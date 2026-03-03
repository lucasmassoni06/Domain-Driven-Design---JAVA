package br.com.fiap;

import java.util.Scanner;

public class MediaScanner {
    public static void main(String[] args) {
        Scanner scan;
        float nota1, nota2, nota3, nota4, media;
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite a primeira nota:");
            nota1 = scan.nextFloat();
            System.out.println("Digite a segunda nota: ");
            nota2 = scan.nextFloat();
            System.out.println("Digite a terceira nota: ");
            nota3 = scan.nextFloat();
            System.out.println("Digite a quarta nota: ");
            nota4 = scan.nextFloat();
            media = (nota1 + nota2 + nota3 + nota4)/4;
            System.out.println("A média das notas " + nota1 + ", "+ nota2 + ", "+ nota3 + " e "+ nota4 + " é: " + media);
        } catch (Exception e) {
            System.out.println("Indique um valor de nota válido!");
        }
    }
}
