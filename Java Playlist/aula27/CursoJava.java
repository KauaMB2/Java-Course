import java.util.Scanner;
public class CursoJava{
	public static void main(String[] args){
		int[] numeros={10,5,15,20,100,25,14,8,3,98,75,62};
		parImpar(numeros);
	}
	public static void parImpar(int[] num){
		String res;
		for(int n:num){
			if(n%2==0){
				res="Par";
			}else{
				res="Impar";
			}
			System.out.printf("%d:%s%n",n,res);
		}
	}
}