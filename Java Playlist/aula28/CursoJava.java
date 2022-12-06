import java.util.Scanner;
public class CursoJava{
	public static void main(String[] args){
		int[] notas={10,85,62,45,98,78,88,60,67,82};
		int ap,rp;
		ap=rp=0;

		passagemPorValor(notas,ap,rp);

		System.out.printf("Aprovados.: %d%n",ap);
		System.out.printf("Reprovados.: %d%n",rp);

		int[] resultado={0,0};

		passagemPorReferencia(notas,resultado);

		System.out.printf("Aprovados.: %d%n",resultado[0]);
		System.out.printf("Reprovados.: %d%n",resultado[1]);
	}
	public static void passagemPorValor(int[] nt, int a, int r){
		for(int n:nt){
			if(n>=60){
				a++;
			}else{
				r++;
			}
		}
	}
	public static void passagemPorReferencia(int[] nt, int[] r){
		for(int n:nt){
			if(n>=60){
				r[0]++;
			}else{
				r[1]++;
			}
		}
	}

}