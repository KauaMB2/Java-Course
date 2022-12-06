public class CursoJava{
	public static void main(String[] args){
		int nota=70;
		if(nota > 50){
			throw new IllegalArgumentException("Valor de nota inválido");
		}
	}
}