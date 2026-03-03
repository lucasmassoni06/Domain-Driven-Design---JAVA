package br.com.fiap;

public class ArCondicionado {
    // atributos
    public int temperatura;
    public String modo;

    // metodos
    public void aumentarTemperatura(){
        temperatura++;
    }

    public void diminuirTemperatura() {
        temperatura--;
    }

    public void trocarModoString(String novoModo){
        modo = novoModo;
    }
}
