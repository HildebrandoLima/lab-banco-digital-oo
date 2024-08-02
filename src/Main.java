
public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Hill");

		Conta conta = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		conta.depositar(100);
		conta.transferir(100, poupanca);

		conta.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
