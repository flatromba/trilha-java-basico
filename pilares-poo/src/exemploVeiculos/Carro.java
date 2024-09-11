public class Carro extends Veiculo {

    private void confereCombustivel() {
        System.out.println("Conferindo combustível");
    }

    private void confereCambio() {
        System.out.println("Conferindo câmbio em neutro");
    }

    public void ligar() {
        confereCombustivel();
        confereCambio();
        System.out.println("Carro ligado");
    }
}
