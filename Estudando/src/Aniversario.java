public class Aniversario {
	public static void main(String[] args) {

		Pessoa p = new Pessoa();

		p.nome = "Renata";
		p.idade = 18;

		System.out.println("Nome: " + p.nome);
        p.fazAniversario();
	}
}
