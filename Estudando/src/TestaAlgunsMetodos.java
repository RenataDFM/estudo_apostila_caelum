public class TestaAlgunsMetodos {
	public static void main(String[] args) {

		// criando a conta
		Conta minhaConta;      // vou usar a classe conta
		minhaConta = new Conta();

		// alterando os valores de minhaConta
	//	minhaConta.dono = "Duke";
		minhaConta.saldo = 1000;

		// saca 200 reais
		minhaConta.saca(200);

		// deposita 500 reais
		minhaConta.deposita(500);
		System.out.println(minhaConta.saldo);

		// saldo 1300

		
		minhaConta.saldo = 1000;
		boolean consegui = minhaConta.saca(2000);
		if (consegui) {
			System.out.println("Consegui sacar");
		} else {
			System.out.println("Não consegui sacar");
		}
		
	}
}
