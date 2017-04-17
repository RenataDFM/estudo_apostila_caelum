public class Programa {
	public static void main(String[] args) {
		// new Conta(); construir / instanciar / criar um objeto
		Conta minhaConta;
		minhaConta = new Conta();
		
		Conta meuSonho;
		meuSonho = new Conta();
		meuSonho.saldo = 150;

	//	minhaConta.dono = "Duke";
		minhaConta.saldo = 1000.0;
		System.out.println("Saldo atual: " + minhaConta.saldo);
		
		minhaConta.saca(200);
		System.out.println("Eu usei o método saca e saquei 200,00 da conta e o saldo agora é : " + minhaConta.saldo);
		
		minhaConta.deposita(100);
		System.out.println("Eu depositei 100,00, utilizando o método deposita e agora o saldo é : " + minhaConta.saldo);
		
		minhaConta.transfere(meuSonho, 200);
		System.out.println("Saldo atual Meu sonho ( tinha 150 + 200) : " + meuSonho.saldo);
		System.out.println("Saldo atual Minha Conta ( tinha 900 - 200 ): " + minhaConta.saldo);
		
	}
}
