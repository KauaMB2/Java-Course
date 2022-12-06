import java.nio.file.*;
public class CursoJava{
	public static void main(String[] args){
		Path fotoNova=Paths.get("C:/Users/Rafael/Desktop/ETE Escola Kauã/Java - CFB Cursos/aula45/fotos/foto1.jpeg");
		Path fotoAntiga=Paths.get("C:/Users/Rafael/Desktop/ETE Escola Kauã/Java - CFB Cursos/aula45/fotos/foto2.jpeg");
		try{
			byte[] bytesFotoNova=Files.readAllBytes(fotoNova);
			Files.write(fotoAntiga,bytesFotoNova);
		}catch(Exception e){
			System.out.print("ERRO"+e);
		}
		
	}
}