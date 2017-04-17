public class Conta {
	int numero;
	double saldo;
	double limite;
	Cliente titular;
	Cliente titular2 = new Cliente();  // Já instância a Conta com um cliente
	

	/*
	 * void saca(double quantidade) { double novoSaldo = this.saldo - quantidade; this.saldo = novoSaldo; }
	 */

	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	void deposita(double quantidade) {
		this.saldo += quantidade;
	}

	/*
	 * void transfere(Conta destino, double valor) { this.saldo = this.saldo - valor; destino.saldo = destino.saldo + valor; }
	 */

	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			// não deu pra sacar!
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}
}
