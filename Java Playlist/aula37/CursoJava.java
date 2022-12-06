import java.util.ArrayList;
public class CursoJava{
	public static void main(String[] args){
		ArrayList<String> carros=new ArrayList<>(100);//100 => Tamanho do Array

		carros.add("HRV");
		carros.add("Polo");
		carros.add(1,"Cruze");//(Posição,Valor)
		carros.add(1,"Argo");//(Posição,Valor)
		carros.add(2,"Fusion");//(Posição,Valor)

		carros.trimToSize();//Diminui a quantidade de elementos possíveis dentro do array que foi definida inicialment(100) para a quantidade de espaços preenchidos dentro do array

		try{
			System.out.println(carros.get(10));
		}catch(IndexOutOfBoundsException e){
			System.out.println("ERRO: Valor fora do índice do array");
		}catch(ClassCastException e){
			System.out.println("ERRO: O Problema é o ClassCastException");
		}finally{
			System.out.println("Fim do programa");
		}
	}
}