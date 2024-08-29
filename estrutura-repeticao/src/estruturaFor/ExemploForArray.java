package estruturaFor;

public class ExemploForArray {
    
    public static void main(String[] args) {
        String alunos []= {"Felipe","Jonas","Julia","Marcos"};

        for (int i=0;i<alunos.length;i++){// em arrays o iterador se inicia em 0 (i=0)
            System.out.println("Aluno: "+alunos[i]);
        }
    }
}
