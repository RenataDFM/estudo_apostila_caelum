public class ExecutaPorta {
	public static void main(String[] args) {

		Porta p = new Porta();

		p.abre();
		p.fecha();

		p.pinta("a");

		if (p.estaAberta()) {
			System.out.println("A porta ainda está aberta");
		} else {
			System.out.println("A porta fechou");
		}
	}

}
