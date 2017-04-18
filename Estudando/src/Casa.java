public class Casa {
	String cor;
	boolean porta1;
	boolean porta2;
	boolean porta3;
	int totalDePortas = 0;
	Porta[] portas;
	int indice = 0;

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

	void adicionaPorta(Porta p) {
		if (indice < 10) {
			portas[indice++] = p;
			System.out.println("Porta " + indice + "adiconada");
		} else {
			System.out.println("O array já está cheio");
		}
	}

	int totalDePortas() {
		for (int i = 0; i < this.portas.length; i++) {
			if (portas[i] != null) {
				totalDePortas += totalDePortas;
			}
		} 
		    return totalDePortas;
	}
}
