package br.com.fiap.bean;

public class ArCondicionado {
    // atribuitos
    public int temperatura;
    public String modo;

    // metodos
    public void aumentarTemperatura(){
        temperatura++;
    }
    public void diminuirTemperatura(){
        temperatura--;
    }
    public void trocarModo(String novoModo){
        modo = novoModo;
    }
}
