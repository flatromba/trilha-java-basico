public abstract class Conta implements ContaInterface{

    private static final int AGENCIA_PADRAO=1;
    private static int SEQUENCIAL=1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }	

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	} 

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, ContaInterface contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	} 

    protected void imprimirInfos() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
    } 
	
	public void realizarEmprestimo(double valor, int parcelas, double juros) {
		double valorEmprestimo=valor+(valor*parcelas*(juros/100));
		double valorMensal=valorEmprestimo/parcelas;
		System.out.println("\nEmprestimo pedido por :"+cliente.getNome());
		System.out.println("Valor emprestimo: R$"+valor+"\nQuantidade de parcelas: "+parcelas+"\nValor dos juros: "+juros+" %");
		System.out.println(String.format("Valor a ser pago: R$ %.2f", valorEmprestimo));
		System.out.println(String.format("Valor das parcelas: R$ %.2f", valorMensal));
		System.out.println("Emprestimo realizado com sucesso!\nValor depositado na conta: "+getNumero());
		this.depositar(valor);
	}	
}
