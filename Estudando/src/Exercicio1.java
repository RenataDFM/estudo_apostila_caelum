public class Exercicio1 {
	public static void main(String[] args) {

		for (int i4 = 150; i4 <= 300; i4++) {
			System.out.println(i4);
		}

		System.out.println("====================================================");

		int soma = 0;
		for (int i4 = 1; i4 <= 1000; i4++) {
			soma = soma + i4; // soma += i4; igual
		}
		System.out.println(soma);

		System.out.println("====================================================");

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) { // resto igual a 0
				System.out.println(i);
			}
		}

		System.out.println("====================================================");

		int fatorial = 1;
		for (int n = 1; n <= 10; n++) {
			fatorial = n * fatorial;
			System.out.println("O fatorial de " + n + " é (" + (n - 1) + "!) * " + n + " = " + fatorial);
			// System.out.println(String.format("O fatorial de %d é (%d!) * %d = %d",n, (n-1), n, fatorial));
		}

		System.out.println("====================================================");

		int fibonacci = 0;
		System.out.println(fibonacci);
		int n_mais_anterior = 0;
		int n_anterior = 1;
		System.out.println(1);
		while (fibonacci < 100) {
			fibonacci = n_mais_anterior + n_anterior;
			
			n_mais_anterior = n_anterior;
			n_anterior = fibonacci;
			
			System.out.println(fibonacci);
		}
	}

}
