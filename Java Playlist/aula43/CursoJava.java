import java.nio.file.*;
public class CursoJava{
	public static void main(String[] args){
		Path diretorio=Paths.get("C:/Users/Rafael/Desktop/ETE Escola Kauã/Java - CFB Cursos");
		Path arquivo=Paths.get("C:/Users/Rafael/Desktop/ETE Escola Kauã/Java - CFB Cursos/aula43/texto.txt");
		if(Files.isDirectory(diretorio)){
			System.out.println("Diretório existe");
		}else{
			System.out.println("Diretório NAO existe");
		}
		if(Files.exists(arquivo)){
			System.out.println("Arquivo existe");
		}else{
			System.out.println("Arquivo NAO existe");
		}
	}
}