public class Empresa {
	Funcionario[] empregados;
	int indice = 0;

	String cnpj;
	String nome;
	Funcionario f = new Funcionario();

	public Empresa() {

	}

	void adiciona(Funcionario f) {
		if (indice < 10) {
			empregados[indice++] = f;
		} else {
			System.out.println("O array j� est� cheio");
		}
	}

	void mostraEmpregados() {
		for (int i = 0; i < 10; i++) { // this.empregados.length (o array pode n�o estar todo preenchido, erro Null)
			if (empregados[i] != null) {
				System.out.println("Funcion�rio na posi��o: " + i);
				System.out.println("Sal�rio : " + empregados[i].salario);
				f.mostra();
			}
		}
	}

	boolean contem(Funcionario f) {
		for (int i = 0; i < this.empregados.length; i++) {
			if (empregados[i].nome == f.nome) {
				return true;
			} else {
				return false;
			}
		}
	}
}
