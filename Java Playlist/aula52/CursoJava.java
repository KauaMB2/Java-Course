import java.util.ArrayList;
import java.util.Iterator;
public class CursoJava{
	public static void main(String[] args){
		ArrayList<Integer> valores=new ArrayList<Integer>();
		ArrayList<Integer> dobro=new ArrayList<Integer>();
		ArrayList<Integer> par=new ArrayList<Integer>();
		ArrayList<Integer> impar=new ArrayList<Integer>();

		System.out.println(Math.min(15,5));//Retorna o menor entre dois valores
		System.out.println(Math.max(15,5));//Retorna o maior entre dois valores
		System.out.println(Math.sqrt(25));//Retorna a raiz quadrada de algum valor
		System.out.println(Math.abs(-64.0));//Retorna o módulo de algum valor
		Double random=Math.random()*101;//Pega valor aleatório
		System.out.println(random);//Exibe valor aleatório
		System.out.println(Math.floor(random));//Exibe valor mais próximo do número quebrado

	}
}