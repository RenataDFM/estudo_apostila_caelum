public class TestaReferencias {
	public static void main(String args[]) {
		
		Conta c1 = new Conta();
		
		c1.deposita(100);

		Conta c2 = c1; // linha importante!
		c2.deposita(200);

		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
		
		// criou uma conta na memória com dois ponteiros
		// se fizer c1 == c2  dá o mesmo valor, pois apontam para o mesmo valor
	}
}
