public class TestaDuasContas {
	public static void main(String[] args) {

		Conta minhaConta;
		minhaConta = new Conta();
		minhaConta.saldo = 1000;

		Conta meuSonho;
		meuSonho = new Conta();
		meuSonho.saldo = 1500000;

		// criou duas contas na memória

		Conta c1 = new Conta();
	//	c1.dono = "Duke";
		c1.saldo = 227;

		Conta c2 = new Conta();
	//	c2.dono = "Duke";
		c2.saldo = 227;

		if (c1 == c2) {
			System.out.println("Contas iguais");
		}else{
			System.out.println("Contas diferentes");
		}
			
		if (minhaConta.transfere(c1, 2000)){
			System.out.println("Saquei");
		}else {
			System.out.println("Nao Saquei");
		}

	}
}
