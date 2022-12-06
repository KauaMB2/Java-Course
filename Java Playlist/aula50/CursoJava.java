import java.util.ArrayList;
import java.util.Iterator;
public class CursoJava{
	public static void main(String[] args){
		ArrayList<String> carros=new ArrayList<String>();
		carros.add("HRV");
		carros.add("Polo");
		carros.add("Golf");
		carros.add("City");
		carros.add("Cruze");
		carros.add("Argo");
		carros.add("Ka");
		System.out.println(carros);
		Iterator<String> it=carros.iterator();
		while(it.hasNext()){//Fala se tem ou não um próximo elemento na lista
			String c=it.next();
			System.out.println(c);//it.next() => Exibe o elemento e na próxima chamada exibe o próximo elemento
			if(c=="Argo"){
				it.remove();//Remove "Argo"
			}
		}
		System.out.println(carros);
	}
}