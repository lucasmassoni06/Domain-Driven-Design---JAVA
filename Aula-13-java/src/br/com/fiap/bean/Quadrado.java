package br.com.fiap.bean;

public class Quadrado {
    // atributos
    private float lado;
    public float Quadrado;
    public Quadrado(float lado) {
        this.lado = lado;
    }

    public Quadrado() {
    }

    //getters e setters

    public float getQuadrado() {
        return Quadrado;
    }

    public void setQuadrado(float quadrado) {
        Quadrado = quadrado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    // metodos da classe
    public float calcularArea(){
        return lado + lado;
    }
}
