public class CursoJava{
	public static void main(String[] args){
		int n=0;

		Jogador j1=new Jogador(++n);
		Jogador j2=new Jogador(++n);
		Jogador j3=new Jogador(++n);

		System.out.print("ANTES DE MODIFICAR O ALERTA:");
		j1.info();
		j2.info();
		j3.info();

		Jogador.alerta=true;//STATIC

		System.out.print("\n\n\nDEPOIS DE MODIFICAR O ALERTA:");
		j1.info();
		j2.info();
		j3.info();
	}
}