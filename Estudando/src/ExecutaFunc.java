public class ExecutaFunc {
	public static void main(String[] args) {

		Funcionario func1 = new Funcionario();
		// Funcionario func2 = new Funcionario();

		Funcionario func2 = func1;

		func1.nome = "Jose";
		func1.departamento = "D200";
         func1.setData(01, 01, 2017);

		/*
		 * func2.nome = "Jose"; func2.departamento = "D200";
		 * 
		 * func1.recebeAumento(2000); System.out.println("Salario atual: " + func1.salario); System.out.println("ganho anual: " + func1.calculaGanhoAnual());
		 */

		func1.mostra();

		if (func1 == func2) {
			System.out.println("iguais"); // são iguais pois apontam para o mesmo lugar no memória Funcionario func2 = func1;
		} else {
			System.out.println("diferentes"); // são diferentes, memso tendo o mesmo nome
		}
	}
}
