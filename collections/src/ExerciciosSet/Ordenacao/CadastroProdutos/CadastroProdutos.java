package ExerciciosSet.Ordenacao.CadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    
    private Set<Produto> conjuntoProdutos;

    public CadastroProdutos() {
        this.conjuntoProdutos= new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        conjuntoProdutos.add(new Produto(cod, nome, preco, quantidade));
    }
    
    public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> exibirPorNome=new TreeSet<>(conjuntoProdutos);
        return exibirPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> exibirPorPreco= new TreeSet<>(conjuntoProdutos);
        conjuntoProdutos.addAll(exibirPorPreco);
        return exibirPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos produto= new CadastroProdutos();
        System.out.println(produto.exibirProdutoPorNome());
        System.out.println(produto.exibirProdutoPorPreco());
        System.out.println("\n\n");

        produto.adicionarProduto(1, "tijolo", 0.25, 10);
        produto.adicionarProduto(2, "bloco", 1.5, 20);
        produto.adicionarProduto(3, "azulejo branco", 2.75, 50);
        produto.adicionarProduto(4, "azulejo azul", 3, 50);
        System.out.println("Produto por nome: "+produto.exibirProdutoPorNome());
        System.out.println("\n\n");
        System.out.println("Produto por preco: "+produto.exibirProdutoPorPreco());
    }
}
