public class Teste {
	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();  // vou usar classe conta
		Cliente c = new Cliente();       // vou usar classe cliente
		minhaConta.titular = c;          // o titular da minha conta é um cliente
		
		
	}
}
