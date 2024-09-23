package ExerciciosMap.OperacoesBasicas.Dicionario;

public class Palavra {
    
    private String palavra;
    private String descricao;

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Palavra(String palavra, String descricao) {
        this.palavra = palavra;
        this.descricao = descricao;
    }
}
