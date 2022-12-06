import java.util.Queue;
import java.util.LinkedList;
public class CursoJava{
	public static void main(String[] args){
		Queue<String> carros=new LinkedList<>();//Fila => O primeira a entrar é o primeiro a sair
		carros.add("HRV");
		carros.add("Golf");
		carros.add("Camaro");
		carros.add("Tiggo 3X");

		System.out.println("Topo da Fila: "+ carros.peek());//Retorna o topo da Fila
		System.out.println(carros);
		System.out.println("Topo da Fila: "+ carros.poll());//Retorna o topo da Fila e tira esse elemento da Fila
		System.out.println(carros);
		System.out.println(carros.isEmpty() ? "Fila vazia":"Fila com elementos");//carros.isEmpty() => Retorna se a Fila está ou não vazia
		carros.clear();//Esvazia a Fila
		System.out.println(carros.isEmpty() ? "Fila vazia":"Fila com elementos");//carros.isEmpty() => Retorna se a Fila está ou não vazia
	}
}