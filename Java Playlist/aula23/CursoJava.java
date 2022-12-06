public class CursoJava{
	public static void main(String[] args){
		int cont=100;
		for(int i=0;i<cont;i++){
			if(i>=10 && i<=60){
				continue;//Exige que o loop passe para o próximo encremento e esqueça dos comandos seguinte
			}
			System.out.printf("%d - ", i);
		}
	}
}