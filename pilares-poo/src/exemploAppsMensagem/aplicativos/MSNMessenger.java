package exemploAppsMensagem.aplicativos;

public class MSNMessenger extends ServicoMsgInstantanea {

    @Override
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem pelo MSN");        
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");        
    }
}