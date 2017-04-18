public class TestaEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];

		for (int i = 0; i < 5; i++) {
			// para adicionar vários funcionários
			// instancio aqui dentro do loop
			Funcionario f = new Funcionario();
			f.salario = 1000.0 + i * 100;
			empresa.adiciona(f);
			f.mostra();
		}
		
		Funcionario f1 = new Funcionario();
		f1.salario = 1000.0;
		f1.nome = "João";
		f1.departamento = "X200";
		empresa.adiciona(f1);
		f1.mostra();

		Funcionario f2 = new Funcionario();
		f2.salario = 1700.0;
		f2.nome = "José";
		f2.departamento = "X200";
		empresa.adiciona(f2);
		f2.mostra();
		
		//empresa.mostraEmpregados();
		
		empresa.contem(f1);
		
		System.out.println("Fim");
	}
}
