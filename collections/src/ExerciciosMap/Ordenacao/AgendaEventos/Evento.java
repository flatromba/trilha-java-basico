package ExerciciosMap.Ordenacao.AgendaEventos;

public class Evento {
    
    private String nome;
    private String atracao;

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtracao() {
        return atracao;
    }

    public void setAtracao(String atracao) {
        this.atracao = atracao;
    }

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    @Override
    public String toString() {
        return "\nEvento: "+ nome +", atração: "+ atracao;
    }    
}
