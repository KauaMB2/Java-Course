public class CursoJava{
	public static void main(String[] args){
		String s1="          CFB Cursos - Curso de Java - ";
		String s2="youtube.com/cfbcursos          ";
		String s3=s1.concat(s2);
		System.out.println(s3);

		//replace
		String s4=s3.replace('C','@');
		System.out.println(s4);

		//toLowerCase - toUpperCase
		String s5=s3.toUpperCase();
		System.out.println(s5);
		String s6=s3.toLowerCase();
		System.out.println(s6);

		//trim
		String s7=s3.trim();//Remove os espaços do início e do final da String(Não sei pra que serve)
		System.out.println(s7);

		//toCharArray
		char[] c=s3.toCharArray();
		System.out.println(c);

		//split
		String[] s8=s3.split(" ");// -  Separa a String em um array de Strings toda vez que encontra " "(Espaço)
		for(String s:s8){
			System.out.println(s);
		}
	}
}