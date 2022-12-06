import java.util.Scanner;

public class CursoJava{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	String nome,res;
	int n1=0,n2=0,n3=0,n4=0,soma=0;
	final int media=60;
	System.out.println("Digite o nome do aluno: ");
	nome=scan.nextLine();
	System.out.println("Digite a primeira nota: ");
	n1=scan.nextInt();
	System.out.println("Digite a segunda nota: ");
	n2=scan.nextInt();
	System.out.println("Digite a terceira nota: ");
	n3=scan.nextInt();
	System.out.println("Digite a quarta nota: ");
	n4=scan.nextInt();
	soma=n1+n2+n3+n4;
	if(soma >= media){
		res="aprovado";
	}else if(soma >=40){
		res="abaixo da média";
	}else{
		res="reprovado";
	}
	System.out.printf("Aluno %s foi %s com nota %d",nome,res,soma);

	}
}