package br.com.fiap.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo {
    static void main(){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número inteiro entre (1 e 10): ");
            int numero = scanner.nextInt();
            int resultado = numero / 2;
            if (numero < 1 || numero > 10){
                throw new Exception("Valor fora da faixa permitida! ");
            }
        } catch (ArithmeticException e) {
            System.out.println("Erro Aritmetico: " + e.getMessage());
        } catch (InputMismatchException e ){
            System.out.println("Erro de formato: o valor digitado não é um número inteiro ");
        } catch (Exception e){
            System.out.println("Erro generico: " + e.getMessage());
        }
        finally {
            System.out.println("Fim de programa! ");
        }
    }
}
