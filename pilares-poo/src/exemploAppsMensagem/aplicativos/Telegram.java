package exemploAppsMensagem.aplicativos;

public class Telegram extends ServicoMsgInstantanea {

    @Override
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }    
}
