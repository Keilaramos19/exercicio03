package ex03;

import java.util.Locale;
import java.util.Scanner;
import ex03.Aluno;


public class Programa {

	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		Aluno al1=new Aluno();
			
		System.out.println("Nome do aluno:");
		al1.nome=sc.nextLine();
			
		System.out.println("Nota 1:");
		al1.nota1=sc.nextDouble();
			
		System.out.println("Nota 2:");
		al1.nota2=sc.nextDouble();
			
		System.out.println("Nota 3:");
		al1.nota3=sc.nextDouble(); 
			
			al1.aprovado();
		sc.close();
	}
}
