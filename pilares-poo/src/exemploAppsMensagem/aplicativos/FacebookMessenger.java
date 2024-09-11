package exemploAppsMensagem.aplicativos;

public class FacebookMessenger extends ServicoMsgInstantanea {

    @Override
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem pelo Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Messenger");
    }
}
