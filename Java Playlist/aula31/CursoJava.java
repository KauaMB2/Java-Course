public class CursoJava{
	public static void main(String[] args){
		if(args.length <= 0){
			System.out.printf("%s%n","Sem valores para somar");
			return;
		}
		int soma=0;
		for(String n:args){
			int v=Integer.valueOf(n);
			soma+=v;
		}
		System.out.printf("Soma dos valores: %d%n",soma);
	}
}