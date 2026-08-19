package br.com.fiap.exercicio.bean;

import br.com.fiap.exercicio.exception.ValorErroDivisao;

public class Calculadora {
    private float numero1 = 0;
    private float numero2 = 0;

    public Calculadora() {
    }

    public float getNumero1() {

        return numero1;
    }

    public Calculadora setNumero1(float numero1) {
        this.numero1 = numero1;
        return this;
    }

    public float getNumero2() {

        return numero2;
    }

    public Calculadora setNumero2(float numero2) {
        this.numero2 = numero2;
        return this;
    }

    public float adicao(float numero1, float numero2) {
        return numero1 + numero2;
    }

    public float subtratao(float numero1, float numero2){
        if(numero1 >= numero2) {
            return numero1 - numero2;
        } else {
            return numero2 - numero1;
        }
    }

    public float multiplicação(float numero1, float numero2){
        return numero1 * numero2;
    }

    public float divisao(float numero1, float numero2){
        if (numero1 == 0 || numero1 == 0) {

        } else {
            return numero1 / numero2;
        }
    }


}
