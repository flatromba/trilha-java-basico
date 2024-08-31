import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ValidacaoProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String[] candidatos= {"Sara","Madruga","Buddy","Ozzy","Jorel"};
        for (String candidato: candidatos) {
            ligarCandidato(candidato);
        }

    }

    public static void ligarCandidato (String candidato) {
        int tentativaRealizada=1;
        boolean continuarLigando=true;
        boolean atendeu=false;
        do {
            atendeu=atender();
            continuarLigando= !atendeu;
            if (continuarLigando)
                tentativaRealizada++;
            else 
                System.out.println("Contato realizado");
        }
        while (continuarLigando && tentativaRealizada<3);

        if (atendeu)
            System.out.println("Conseguimos contato com "+candidato+" na "+tentativaRealizada+"° tentativa");
        else 
            System.out.println("Não conseguimos contato com  "+candidato);
    }

    public static boolean atender () {
        return new Random().nextInt(3)==1;
    }

    public static void imprimirSelecionados () {
        String[] candidatos= {"Sara","Madruga","Buddy","Ozzy","Jorel"};
        System.out.println("Lista dos candidatos selecionados");
        for (int i=0;i<candidatos.length;i++) {
            System.out.println("O candidato de numero "+(i+1)+" é: "+candidatos[i]);
        }
    }

    public static void selecionarCandidatos () {
        String[] candidatos= {"Sara","Madruga","Buddy","Ozzy","Jorel","Coralina","Ana Catarina","Jujuba","Venom","Flavio"};
        int candidatosSelecionados=0;
        int candidatosAtual=0;
        double salarioBase=2000.00;
        while(candidatosSelecionados<5 && candidatosAtual<candidatos.length) {
            String candidato= candidatos[candidatosAtual];
            double pretensaoSalarial=pretensaoSalarial();
            System.out.println("O candidato "+candidato+" solicitou "+pretensaoSalarial+" de pretensão salarial");
            if (salarioBase>=pretensaoSalarial) {
            System.out.println("Candidato "+candidato+" selecionado");
            candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    public static double pretensaoSalarial () {
        return ThreadLocalRandom.current().nextDouble(1500,2500);
    }

    public static void analisarCandidatos (double pretensaoSalarial) {
        double salarioBase=2000.00; 

        System.out.println("Digite sua pretensão salarial");
        if (salarioBase>pretensaoSalarial)
        System.out.println("Ligar para o candidato");
        else if (salarioBase==pretensaoSalarial)
        System.out.println("Ligar para o candidato com contra poposta");
        else 
        System.out.println("Aguardando resultado demais candidatos");
    }
}
