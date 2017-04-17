public class Casa {
	String cor;
	boolean porta1;
	boolean porta2;
	boolean porta3;

	void pinta(String s) {
		System.out.println("Porta pintada de : " + s);
	}

	int quantasPortasEstaoAbertas() {
		porta2 = false;
		porta3 = true;
		porta1 = true;
		int aberta = 0;

		if (porta1) {
			aberta += 1;
		}

		if (porta2) {
			aberta += 1;
		}

		if (porta3) {
			aberta += 1;
		}

		return aberta;

	}
}
