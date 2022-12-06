import java.util.Scanner;
public class CursoJava{
	public static void main(String[] args){
		int n1=10,n2=5,n3=2;
		int res=soma(n1,n2,n3);

		System.out.printf("%d",res);
	}
	public static int soma(int... n){//Permite a passagem de infinitos valores para dentro da função
		int res=0;
		for(int v:n){
			res+=v;
		}
		return res;
	}

}