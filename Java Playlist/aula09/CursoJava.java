public class CursoJava{
	public static void main(String[] args){
		//(Modificador de acesso) (Tipo de retorno) (Nome) (Parâmetros)
		msg("Kauã Moreira Batista",10);
		int soma1=soma(1,2,3,5,7,11,13,7);
		Double soma2=soma(2.7,3.7,4.4);
		System.out.printf("Soma1: %d | Soma2: %.3f",soma1,soma2);
	}
	public static void msg(String txt,int q){
		for(int i=0;i<q;i++){
			System.out.println(txt);
		}
	}
	public static int soma(int... numeros){
		int res=0;
		for(int n:numeros){
			res+=n;
		}
		System.out.println("Integer Add Function");
		return res;
	}
	public static Double soma(Double... numeros){
		Double res=0.0;
		for(Double n:numeros){
			res+=n;
		}
		System.out.println("Double Add Function");
		return res;
	}
}