class TestaIdade {
	public static void main(String[] args) {
		// imprime a idade
		int idade = 20;
		System.out.println("Idade Atual " + idade);

		// gera uma idade no ano seguinte
		int idadeNoAnoQueVem;
		idadeNoAnoQueVem = idade + 1;

		// imprime a idade
		System.out.println("Idade Ano que vem " + idadeNoAnoQueVem);

		int idade2 = 15;

		if (idade2 < 18) {
			System.out.println("Não pode entrar");
		}

		int idade3 = 14;
		if (idade3 < 18) {
			System.out.println("Não pode entrar");
		} else {
			System.out.println("Pode entrar");
		}

		int idade4 = 15;
		boolean amigoDoDono = true;
		if (idade4 < 18 && amigoDoDono == false) {
			System.out.println("Não pode entrar");
		} else {
			System.out.println("Pode entrar");
		}

		int mes = 1;
		if (mes == 1) { // comparar
			System.out.println("Você deveria estar de férias");
		}

		int idade5 = 10;
		while (idade5 < 18) {
			System.out.println(idade5);
			idade5 = idade5 + 1;
		}

		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i = i + 1;
		}

		int i1 = 0;
		while (i1 < 10) {
			System.out.println("olá!");
			i1 = i1 + 1;
		}

		for (int i2 = 0; i2 < 10; i2 = i2 + 1) {
			System.out.println("olá2!");
		}

		int y = 50;
		int x = 10;
		for (int i3 = x; i3 < y; i3++) {
			System.out.println(i3 + " < " + y + " " + (i3 < y));

			if (i3 % 19 == 0) {  // resto igual a 0
				System.out.println("Achei um número divisível por 19 entre x e y");
				break;
			}

			System.out.println(i3);
		}

		for (int i4 = 0; i4 < 100; i4++) {
			if (i4 > 50 && i4 < 60) {
				continue;
			}
			System.out.println(i4);
		}

		for (int i4 = 0; i4 < 100; i4++) {
			if (i4 > 50 && i4 < 60) {
			} else {
				System.out.println(i4);
			}
		}
	}

}
