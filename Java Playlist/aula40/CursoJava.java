public class CursoJava{
	public static void main(String[] args){
		String s1=new String("CFB Cursos");
		String s2="bruno";
		String s3="Curso de Java";
		String s4="CFB Cursos";
		String s5="cfb cursos";
		String s6="Bruno";

		//compareTo
		System.out.println(s3.compareTo(s1));
		System.out.println(s1.compareTo(s1));
		System.out.println(s1.compareTo(s3));

		//equalsIgnoreCase
		if(s1.equalsIgnoreCase(s4)){
			System.out.println("s1 igual s2");
		}else{
			System.out.println("s1 diferente de s2");
		}

		//equals vs ==
		if(s1.equals(s4)){
			System.out.println("s1 igual s2");
		}else{
			System.out.println("s1 diferente de s2");
		}
		if(s1==s4){
			System.out.println("s1 igual s2");
		}else{
			System.out.println("s1 diferente de s2");
		}

	}
}