import java.util.Stack;
public class CursoJava{
	public static void main(String[] args){
		Stack<String> carros=new Stack<>();//Pilha => O primeira a entrar é o último a sair
		carros.push("HRV");
		carros.push("Golf");
		carros.push("Camaro");
		carros.push("Tiggo 3X");

		System.out.println("Topo da pilha: "+ carros.peek());//Retorna o topo da pilha
		System.out.println(carros);
		System.out.println("Topo da pilha: "+ carros.pop());//Retorna o topo da pilha e tira esse elemento da pilha
		System.out.println(carros);
		System.out.println(carros.empty() ? "Pilha vazia":"Pilha com elementos");//carros.empty() => Retorna se a pilha está ou não vazia
		carros.clear();//Esvazia a pilha
		System.out.println(carros.empty() ? "Pilha vazia":"Pilha com elementos");//carros.empty() => Retorna se a pilha está ou não vazia
	}
}