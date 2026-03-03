package br.com.fiap;

public class UsarArCondicionado {
    public static void main(String[] args) {
        ArCondicionado arzin1 = new ArCondicionado();
        arzin1.temperatura = 25;
        arzin1.modo = "esfriar";

        arzin1.trocarModoString("aquecer");
        arzin1.aumentarTemperatura();
        arzin1.aumentarTemperatura();
        arzin1.aumentarTemperatura();

        System.out.println("Modo: " + arzin1.modo + "\nTemperatura: " + arzin1.temperatura);
    }
}
