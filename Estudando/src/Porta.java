public class Porta {
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;

	void abre() {
		aberta = true;
		System.out.println("Porta aberta");
	}

	void fecha() {
		aberta = false;
		System.out.println("Porta fechada");
	}

	void pinta(String s) {
		if (s == "a") {
			System.out.println("Porta pintada de : Azul");
		} else if (s == "b") {
			System.out.println("Porta pintada de : Branco");
		} else if (s == "c") {
			System.out.println("Porta pintada de : Coral");

		}
	}

	boolean estaAberta() {
		return aberta;
	}
}
