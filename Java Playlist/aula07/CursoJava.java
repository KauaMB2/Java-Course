import java.util.Arrays;
import java.util.Scanner;
public class CursoJava{
	public static void main(String[] args){
		int[] num={9,2,7,1,8,5,3,4,0,6};
		int[] numeros=new int[num.length];
		int pos;

		System.out.println("Normal) Array \"num\"");
		for(int n:num){
			System.out.printf(" - %d",n);
		}

		System.out.println("\n\nOrdenado) Array \"num\"");
		Arrays.sort(num); //ORDENA ELEMENTOS DO ARRAY
		for(int n:num){
			System.out.printf(" - %d",n);
		}

		System.out.println("\n\nPreenchido) Array \"num\"");
		Arrays.fill(num,10);
		for(int n:num){
			System.out.printf(" - %d",n);
		}

		System.out.println("\n\nCopiando) Array \"num\" em Array \"numeros\"");
		System.arraycopy(num,0,numeros,0,5);
		for(int n:numeros){
			System.out.printf(" - %d",n);
		}

		System.out.println("\n\nEntre com um valor inteiro: ");
		Scanner scan=new Scanner(System.in);
		int p=scan.nextInt();
		System.out.println("Pesquisando dado) Array \"numeros\"");
		pos=Arrays.binarySearch(num,p);
		String res=pos>0 ? "Sim" : "Não";
		System.out.printf("O elemento %d está no array? %s na posição %d",p,res,pos);

	}
}