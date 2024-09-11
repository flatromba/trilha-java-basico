
public class Autodromo {
    public static void main(String[] args) throws Exception {
        Carro onix=new Carro();
        onix.setPlaca("ABC-1234");
        onix.ligar();

        Moto fazer=new Moto();
        fazer.setPlaca("DEF-5678");
        fazer.ligar();

        Veiculo veiculo=onix;
        veiculo.ligar();
    }
}
