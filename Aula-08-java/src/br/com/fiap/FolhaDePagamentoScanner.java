package br.com.fiap;

import java.util.Scanner;

public class FolhaDePagamentoScanner {
    public static void main(String[] args) {
        Scanner scan;
        double bruto,inss,plano,salarioinss,saude,liquido;
        int dependentes = 1;
        try{
            scan = new Scanner(System.in);
            System.out.println("Qual é o seu salário bruto: ");
            bruto = scan.nextDouble();
            System.out.println("Número de dependentes: ");
            dependentes += scan.nextInt();
            System.out.println("Valor do desconto INSS: ");
            inss = scan.nextFloat();
            System.out.println("Valor do Plano de Saúde: ");
            plano = scan.nextDouble();

            salarioinss = bruto * inss;
            saude = dependentes * plano;
            liquido = bruto - (salarioinss + saude);
            System.out.printf("O salário liquido é: %.2f,%nO salário bruto é de: %.2f,%nO desconto do INSS é de: %.2f,%nO valor do plano de saúde é de %.2f,%nO número de dependetes é de: %d ", liquido, bruto, inss, plano, dependentes);

        } catch (Exception e) {
            System.out.println("Digite um valor válido!");
        }
    }
}
