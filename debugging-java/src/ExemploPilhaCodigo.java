public class ExemploPilhaCodigo {
    

    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando o programa");
        a();
        System.out.println("Finalizando o programa");
    }

    static void a() {
        System.out.println("Iniciou o método a");
        b();
        System.out.println("Finalizou o método a");
    }

    static void b() {
        System.out.println("Iniciou o método b");
        for (int i=0;i<=5;i++)  
        System.out.println(i);
        c();
        System.out.println("Finalizou o método b");
    }

    static void c() {
        System.out.println("Iniciou o método c");
        Thread.dumpStack();
        System.out.println("Finalizou o método c");
    }
}

