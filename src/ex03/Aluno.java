package ex03;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public void aprovado() {
		double media= nota1+nota2+nota3;
		double diferenca=60-media;
	if (media>60) {
		System.out.println("Aprovado");
		System.out.printf("Media Final:%.2f",media);
	}
	else {
		System.out.println("Reprovado");
		System.out.printf("Media Final:%.2f",media);
		System.out.println("Faltando pontos para ser aprovado:"+diferenca+"pontos.");
	}
	
	}
}
	
