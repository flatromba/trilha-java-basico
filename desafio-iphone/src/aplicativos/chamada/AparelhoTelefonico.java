package aplicativos.chamada;

public class AparelhoTelefonico implements Telefone {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para "+numero+" pelo telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação pelo telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pelo telefone");
    }    
}
