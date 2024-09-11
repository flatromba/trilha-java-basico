package exemploAppsMensagem.aplicativos;

public abstract class ServicoMsgInstantanea {
    
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected void validarConexao() {
        System.out.println("Validando conexão com internet");
    }

}
