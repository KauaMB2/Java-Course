public class CursoJava{
	public static void main(String[] args){
		char[] texto_c={'C','u','r','s','o',' ','d','e',' ','J','a','v','a'};
		char[] text_vazio=new char[10];
		String texto_s=new String("CFB Cursos");
		String s1=new String(texto_c);
		String s2=new String(texto_s);
		String s3=new String(texto_c,0,5);
		int tam=s3.length();
		char posicaoDois=texto_s.charAt(2);
		System.out.printf("%s%n%s%n%s%n%s%n",s1,s2,s3,posicaoDois);
		
	}
}