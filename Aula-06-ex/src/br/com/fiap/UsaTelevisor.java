package br.com.fiap;

public class UsaTelevisor {
    public static void main(String[] args) {
        Televisor televisor1 = new Televisor();
         televisor1.volume = 9;
         televisor1.canal = 35;

         televisor1.aumentarVolume();
         televisor1.diminuirVolume();
         televisor1.trocarCanal(40);

        System.out.println("Canal: " + televisor1.canal + "\nVolume: " + televisor1.volume);
    }
}
