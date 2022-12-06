public class CursoJava{
	public static void main(String[] args){
		int n=0;
		Jogador j1=new Jogador(++n);
		Jogador j2=new Jogador(++n);
		System.out.printf("Num => j1.num=%d,j2.num=%d",j1.num,j2.num);
	}
}