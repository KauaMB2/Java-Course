import java.util.Scanner;
public class CursoJava{
	public static void main(String[] args){
		char[] gabarito={'a','a','b','d','c'};
		char[] respostas = new char[gabarito.length];
		int nota=0;
		Scanner scan=new Scanner(System.in);
		boolean working=true;
		char res;
		while(working){
			working=false;
			for(int i=0;i<gabarito.length;i++){
				System.out.printf("Informa a resposta %d: ",i);
				respostas[i]=scan.nextLine().charAt(0);
			}
			for(int i=0;i<gabarito.length;i++){
				if(respostas[i]==gabarito[i]){
					nota++;
				}
			}
			System.out.printf("%nNota do aluno: %d%nDigite \"S\" para digitar outra nota%n",nota);
			res=scan.nextLine().charAt(0);
			switch(res){
				case 'S': case 's':
					working=true;
					break;
				default:
					break;
			}

		}
			
	}
}