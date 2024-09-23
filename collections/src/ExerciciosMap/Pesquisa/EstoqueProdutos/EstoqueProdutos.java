package ExerciciosMap.Pesquisa.EstoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    
    private Map<Long, Produto> mapaDeProdutos;

    public EstoqueProdutos() {
        this.mapaDeProdutos= new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        mapaDeProdutos.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(mapaDeProdutos);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal= 0;
        if (!mapaDeProdutos.isEmpty()) {
            for (Produto produto: mapaDeProdutos.values()) {
                valorTotal+=produto.getPreco()*produto.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro= null;
        double maiorPreco= Double.MIN_VALUE;
        if (!mapaDeProdutos.isEmpty()) {
            for (Produto produto: mapaDeProdutos.values()) {
                if (produto.getPreco()>maiorPreco) {
                    produtoMaisCaro=produto;
                    maiorPreco=produto.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato= null;
        double menorPreco= Double.MAX_VALUE;
        if (!mapaDeProdutos.isEmpty()) {
            for (Produto produto: mapaDeProdutos.values()) {
                if (produto.getPreco()<menorPreco) {
                    produtoMaisBarato=produto;
                    menorPreco=produto.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidade= null;
        int maiorQuantidade=Integer.MIN_VALUE;
        if (!mapaDeProdutos.isEmpty()) {
            for (Produto produto: mapaDeProdutos.values()) {
                if (produto.getQuantidade()>maiorQuantidade) {
                    produtoMaiorQuantidade=produto;
                    maiorQuantidade=produto.getQuantidade();
                }
            }
        }
        return produtoMaiorQuantidade;
    }

    public static void main(String[] args) {
        EstoqueProdutos produto= new EstoqueProdutos();
        produto.exibirProdutos();
        produto.adicionarProduto(1, "Parafuso", 5, 2.5);
        produto.adicionarProduto(2, "Prego", 10, 1.5);
        produto.adicionarProduto(3, "Porca", 10, 0.5);

        System.out.println("Valor total em estoque: "+produto.calcularValorTotalEstoque());
        System.out.println("Produto em maior quantidade: "+produto.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
        System.out.println("Produto mais barato: "+produto.obterProdutoMaisBarato());
        System.out.println("Produto mais caro: "+produto.obterProdutoMaisCaro());
    }
}
