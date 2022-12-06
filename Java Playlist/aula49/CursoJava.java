import java.util.HashSet;
public class CursoJava{
	public static void main(String[] args){
		HashSet<String> carros=new HashSet<String>();
		carros.add("Polo");
		carros.add("HRV");
		carros.add("Golf");
		carros.add("Camaro");
		carros.add("Mustang");
		carros.add("Cruze");
		System.out.println(carros);

		System.out.println(carros.contains("Camaro")?"SIM":"NAO");//Verifica se tem ou não
		
		carros.remove("Golf");
		System.out.println(carros);
		
		carros.clear();
		System.out.println(carros);

	}
}