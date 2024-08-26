public class SmartTV{
    boolean ligada;
    int canal;
    int volume=10;

    public  String ligar(){
        ligada=true;
        return "SmartTV ligada";
    }

    public String desligar(){
        ligada=false;
        return "SmartTV desligada";
    }

    public int aumentarCanal(){
        canal++;
        return canal;
    }

    public int diminuirCanal(){
        canal--;
        return canal;
    }

    public void definirCanal(int canalDefinido){
        canal=canalDefinido;
    }

    public int aumentarVolume(){
        volume++;
        return volume;
    }

    public int diminuirVolume(){
        volume--;
        return volume;
    }
}