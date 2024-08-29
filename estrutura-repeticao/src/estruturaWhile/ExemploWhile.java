package estruturaWhile;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        float mesada=50.0F;

        while(mesada>0) {
            float valorDoce=valorAleatorio();
            if (valorDoce>mesada)
                valorDoce=mesada;

            System.out.println("Valor do doce: R$"+valorDoce+" adicionado");
            mesada=mesada-valorDoce;
            System.out.println("Valor da mesada: R$"+mesada);
        }
        System.out.println("Gastou toda a mesada em doces");
    }
    private static float valorAleatorio() {
        return ThreadLocalRandom.current().nextFloat(2,8);
    }
}
