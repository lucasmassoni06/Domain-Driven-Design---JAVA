package br.com.fiap.aula.bean.exceptions;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message){
        super(message);
    }
}
