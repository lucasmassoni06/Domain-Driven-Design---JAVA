package br.com.fiap.bean;

public class Triangulo extends Quadrado{
    //atributos
    private float altura;
    //construtores
    public Triangulo(){

    }

    public Triangulo(float lado, float altura) {
        super(lado);
        this.altura = altura;
    }

    // getters e setters


    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // metodos da classe

    @Override
    public float calcularArea(){
        return super.getLado() * altura / 2;
    }
}
