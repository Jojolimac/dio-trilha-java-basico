public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando o canal para: " + canal);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o canal para: " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal para: " + canal);
    }
    public void aumentarVolume(){
        //volume = volume + 1
        volume++;
        System.out.println("Aumentendo o volume para: " + volume);
    }
    public void diminuirVolume(){
        //volume = volume - 1
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}