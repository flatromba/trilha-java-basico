package aplicativos.smartphone;

import aplicativos.chamada.Telefone;
import aplicativos.internet.Safari;
import aplicativos.musica.Ipod;

public class Iphone implements Telefone, Safari, Ipod  {

    @Override
    public void tocar() {
        System.out.println("Tocando música pelo iPhone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música pelo iPhone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música "+musica+" pelo iPhone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página "+url+" pelo iPhone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba pelo iPhone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página pelo iPhone");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para "+numero+" pelo iPhone");
    }

    @Override
    public void atender() {
        System.out.println("Atendo ligação pelo iPhone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pelo iPhone");
    }    
}
