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
			System.out.println("O array já está cheio");
		}
	}

	void mostraEmpregados() {
		for (int i = 0; i < 10; i++) { // this.empregados.length (o array pode não estar todo preenchido, erro Null)
			if (empregados[i] != null) {
				System.out.println("Funcionário na posição: " + i);
				System.out.println("Salário : " + empregados[i].salario);
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
