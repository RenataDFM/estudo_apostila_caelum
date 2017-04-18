public class ExecutaPorta {
	public static void main(String[] args) {

		Porta p = new Porta();
		Casa c = new Casa();

		p.abre();
		p.fecha();

		// pinte
		p.pinta("a");

		// coloque portas

		//
		System.out.println("Total de portas " + c.totalDePortas());

		if (p.estaAberta()) {
			System.out.println("A porta ainda está aberta");
		} else {
			System.out.println("A porta fechou");
		}
	}

}
