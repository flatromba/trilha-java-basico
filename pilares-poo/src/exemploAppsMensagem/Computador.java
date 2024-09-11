package exemploAppsMensagem;

import exemploAppsMensagem.aplicativos.FacebookMessenger;
import exemploAppsMensagem.aplicativos.MSNMessenger;
import exemploAppsMensagem.aplicativos.ServicoMsgInstantanea;
import exemploAppsMensagem.aplicativos.Telegram;

public class Computador {
    public static void main(String[] args) {
        ServicoMsgInstantanea simulacao=null;

        String appEscolhido="fcb";

        if (appEscolhido.equals("msn"))
            simulacao=new MSNMessenger();
        else if (appEscolhido.equals("tlg"))
            simulacao=new Telegram();
        else if (appEscolhido.equals("fcb"))
            simulacao=new FacebookMessenger();
        else 
            System.out.println("App invalido");
        
        simulacao.enviarMensagem();
        simulacao.receberMensagem();
    }
}
