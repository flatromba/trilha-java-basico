package aplicativos.internet;

public class NavegadorInternet implements Safari {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina: "+url+" pelo safari");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba pelo safari");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina pelo safari");
    }
    
}
