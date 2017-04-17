
public class Pessoa {
  String nome;
  int idade;
  int idadeNoAnoQueVem;
  int idadeDaquiaCincoAnos;
  
  void fazAniversario(){
	 idadeNoAnoQueVem = idade + 1;
	 idadeDaquiaCincoAnos = idade + 5;
	 
	 System.out.println("Idade Ano Vem: " + idadeNoAnoQueVem);
	 System.out.println("Idade 5 anos: " + idadeDaquiaCincoAnos);
	 
  }
  
  
}
