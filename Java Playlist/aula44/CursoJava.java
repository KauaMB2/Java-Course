import java.nio.file.*;
import java.util.List;
public class CursoJava{
	public static void main(String[] args){
		Path arquivo=Paths.get("C:/Users/Rafael/Desktop/ETE Escola Kauã/Java - CFB Cursos/aula44/texto.txt");
		try{
			List<String> linhas=Files.readAllLines(arquivo);
			for(String linha:linhas){
				System.out.println(linha);
			}
		}catch(Exception e){
			System.out.print("ERRO"+e);
		}
		
	}
}