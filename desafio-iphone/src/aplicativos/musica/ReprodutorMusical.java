package aplicativos.musica;

public class ReprodutorMusical implements Ipod {

    @Override
    public void tocar() {
        System.out.println("Tocando música pelo ipod");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música pelo ipod");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica: "+musica+" pelo ipod");
    }     
}
