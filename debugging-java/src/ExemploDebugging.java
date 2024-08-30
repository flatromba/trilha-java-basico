import java.util.Scanner;

public class ExemploDebugging {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String[] alunos={"Flavio","Sara","Xuxuvida","Xuxunenis"};

        double media =calculaMediaTurma(alunos,entrada);
        System.out.println("Médida da turma: "+media);
    }

    public static double calculaMediaTurma(String[] alunos, Scanner entrada) {
        double soma=0;
        for (String aluno: alunos) {
            System.out.printf("Nota do aluno "+aluno+":");
            double nota=entrada.nextDouble();
            soma+=nota;
        }
        return soma/alunos.length;
    }
}
