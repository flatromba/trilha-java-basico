package tela;

import aplicativos.chamada.AparelhoTelefonico;
import aplicativos.chamada.Telefone;
import aplicativos.internet.NavegadorInternet;
import aplicativos.internet.Safari;
import aplicativos.musica.Ipod;
import aplicativos.musica.ReprodutorMusical;
import aplicativos.smartphone.Iphone;

public class Touch {
    
    public static void main(String[] args) {
        String musica= "musica";
        String numero= "11912345678";
        String url= "www.apple.com"; 

        Iphone iphone=new Iphone();
       
        Telefone telefone=new AparelhoTelefonico();
        telefone.ligar(numero);
        iphone.ligar(numero);
        telefone.atender();
        iphone.atender();
        telefone.iniciarCorreioVoz();
        iphone.iniciarCorreioVoz();
        System.out.println("\n\n");

        Safari safari=new NavegadorInternet();
        safari.exibirPagina(url);
        iphone.exibirPagina(url);
        safari.adicionarNovaAba();
        iphone.adicionarNovaAba();
        safari.atualizarPagina();
        iphone.atualizarPagina();
        System.out.println("\n\n");

        Ipod ipod=new ReprodutorMusical();
        ipod.tocar();
        iphone.tocar();
        ipod.pausar();
        iphone.pausar();
        ipod.selecionarMusica(musica);
        iphone.selecionarMusica(musica);  

    }
}
