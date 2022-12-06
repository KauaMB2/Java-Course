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
		for(int i=0;i<carros.size();i++){
			System.out.println(carros.get(i));
		}

		System.out.println("-----------------------");
		carros.remove("Fusion");
		carros.remove(0);
		System.out.println(carros.indexOf("Cruze"));
		for(int i=0;i<carros.size();i++){
			System.out.println(carros.get(i));
		}

		System.out.println("-----------------------");
		for(int i=0;i<carros.size();i++){
			System.out.println(carros.get(i));
		}

		System.out.println("-----------------------");
		carros.clear();
		for(int i=0;i<carros.size();i++){
			System.out.println(carros.get(i));
		}
	}
}