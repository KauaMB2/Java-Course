import java.util.HashMap;
public class CursoJava{
	public static void main(String[] args){
		HashMap<Integer,String> carros=new HashMap<Integer,String>();
		carros.put(1,"Polo");
		carros.put(2,"HRV");
		carros.put(3,"Golf");
		carros.put(4,"Camaro");
		carros.put(5,"Mustang");
		carros.put(6,"Cruze");
		System.out.println(carros);
		System.out.println("-----------------------");
		for(int i=1;i<carros.size();i++){
			System.out.println(carros.get(i));//Pega algum elemento pela chave
		}
		System.out.println("-----------------------");
		for(String c:carros.values()){//carros.values() => Retorna todos os valores do HarshMap
			System.out.println(c);
		}
		System.out.println("-----------------------");
		carros.clear();//Esvazia o HarshMap
		System.out.println(carros);
	}
}