public class ExecutaCasa {
	public static void main(String[] args) {
		Casa c = new Casa();

		c.pinta("Amarelo");

		System.out.println(c.quantasPortasEstaoAbertas()+ " Porta(s) Aberta(s)");
	}
}
