public class CursoJava{
	public static void main(String[] args){
		String s1="CFB Cursos -  Curso de Java - ";
		String s2="youtube.com/cfbcursos";
		System.out.println(s1);

		//startsWith e endsWith
		if(s1.endsWith("Java - ")){
			System.out.println("Verdadeiro");
		}else{
			System.out.println("Falso");
		}
		if(s1.startsWith("Java - ")){
			System.out.println("Verdadeiro");
		}else{
			System.out.println("Falso");
		}
		//indexOf - Localiza palavra específica da String e retorna o índice do elemento
		System.out.println(s1.indexOf('C'));
		//substring - Seleciona um intervalo específico de palavras em um String
		System.out.println(s1.substring(4,19));
		//concat - Junta uma String com a outra
		System.out.println(s1.concat(s2));

	}
}