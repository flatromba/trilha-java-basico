package ExerciciosList.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    
    private List<Item> carrinhoDeCompra;

    public Carrinho() {
        this.carrinhoDeCompra= new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoDeCompra.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemRemovido= new ArrayList<>();
        for (Item item: carrinhoDeCompra) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemRemovido.add(item);
            }            
        }
        itemRemovido.removeAll(itemRemovido);
    }

    public double calcularValorTotal() {
        double valorTotal=0;
        for (Item item: carrinhoDeCompra) {
            double valorItem=(item.getPreco())*(item.getQuantidade());
            valorTotal+=valorItem;
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(carrinhoDeCompra);
    }

    public static void main(String[] args) {
        Carrinho carrinho=new Carrinho();
        carrinho.exibirItens();
        System.out.println("\n\n");        

        carrinho.adicionarItem("oculos", 20.50, 2);
        carrinho.exibirItens();
        System.out.println("\n\n");

        carrinho.adicionarItem("isqueiro", 3.75, 5);
        carrinho.adicionarItem("ventilador", 130.00, 1);
        carrinho.adicionarItem("caneta", 2.25, 10);
        carrinho.exibirItens();
        System.out.println("\n\n");

        carrinho.removerItem("oculos");
        carrinho.exibirItens();
        System.out.println("\n\n");

        System.out.println("Valor total do carrinho: R$"+carrinho.calcularValorTotal());
    }
}
