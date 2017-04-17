public class Empresa {
	Funcionario[] empregados;
	String cnpj;
    String nome;
    
    Funcionario f1 = new Funcionario();
    f1.salario = 1000;
    empresa.adiciona(f1);
    
    Funcionario f2 = new Funcionario();
    f2.salario = 1700;
    empresa.adiciona(f2);
    
    void adiciona(Funcionario f){
    	empregados[10] = f;
    }
}
