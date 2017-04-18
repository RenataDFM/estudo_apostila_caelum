public class Funcionario {
	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String rg;

	private Data dataDeEntrada;

	void setData(int dia, int mes, int ano) {
		if (dataDeEntrada == null) {
			dataDeEntrada = new Data();
		}

		dataDeEntrada.dia = dia;
		dataDeEntrada.mes = mes;
		dataDeEntrada.ano = ano;
	}

	void recebeAumento(double valor) {
		salario += valor;
	}

	double calculaGanhoAnual() {
		double anual = (salario * 12);
		return anual;
	}

	void mostra() {
		System.out.println("Nome: " + nome);
		System.out.println("Departamento: " + departamento);
		System.out.println("Salario atual: " + salario);
		System.out.println("Data de Entrada: " + dataEntrada);
		System.out.println("RG: " + rg);
		System.out.println("Salário anual: " + calculaGanhoAnual());

		//System.out.println("Data de entrada: " + this.dataDeEntrada.formatada());
	}
	
	
}
