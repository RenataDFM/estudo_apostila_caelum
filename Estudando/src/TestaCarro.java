public class TestaCarro {
	public static void main(String[] args) {

		Carro meuCarro;
		meuCarro = new Carro();

		// mandei os valores para os atributos do meu carro
		meuCarro.cor = "Verde";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;

		// liga o carro
		meuCarro.liga(); // chamei o método liga

		// acelera o carro
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
		
		meuCarro.motor = new Motor();
		meuCarro.motor.potencia = 100;
		meuCarro.motor.tipo = "Acelera!";

		System.out.println(meuCarro.motor.potencia);
		System.out.println(meuCarro.motor.tipo);
	}
}
