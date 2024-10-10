public class Main {
    public static void main(String[] args) {
        Cliente flavio=new Cliente();
        flavio.setNome("Flavio");
        flavio.setCpf("123.456.789-01");

        Cliente sara=new Cliente();
        sara.setNome("Sara");
        sara.setCpf("987.654.321-09");

        Conta cc1=new ContaCorrente(flavio);
        Conta poup1=new ContaPoupanca(flavio);
        Conta cc2=new ContaCorrente(sara);
        Conta poup2=new ContaPoupanca(sara);        

        cc1.depositar(200);
        poup1.depositar(100);
        cc1.sacar(50);
        poup1.transferir(50, cc2);
        cc2.depositar(200);
        poup2.depositar(125);

        cc1.imprimirExtrato();
        poup1.imprimirExtrato();
        cc2.imprimirExtrato();
        poup2.imprimirExtrato();
        
        cc1.realizarEmprestimo(1000, 12, 5);
        cc2.realizarEmprestimo(2500, 6, 2.5);
        cc2.imprimirExtrato();
        cc2.transferir(500, poup2);

        cc1.imprimirExtrato();
        cc2.imprimirExtrato();
        poup2.imprimirExtrato();
    }
}
