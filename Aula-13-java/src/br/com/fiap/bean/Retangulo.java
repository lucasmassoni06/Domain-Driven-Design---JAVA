package br.com.fiap.bean;

public class Retangulo extends Quadrado{
    // atributos
    private float altura;
    // constructor
    public Retangulo(){
    }
    public Retangulo(float lado, float altura) {
        super.setLado(lado);
        this.altura = altura;
    }

    //getters e setters

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //metodos

    public float calcularArea(){
        return super.getLado() * altura;
    }
}
