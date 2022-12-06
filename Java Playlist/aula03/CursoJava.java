public class CursoJava{
	public static void main(String[] args){
		int nota=85, faltas=0, maxFaltas=5, media=60;
		String res;
		res=(nota >= media ? "Passou" : "Reprovou");
		System.out.printf("Resultado: %s%n",res);
		int pos=7;
		switch(pos){
			case 1:
				System.out.println("Primeiro Lugar!");
				break;
			case 2:
				System.out.println("Segundo Lugar!");
				break;
			case 3:
				System.out.println("Terceiro lugar Lugar!");
				break;
			case 4: case 5: case 6:
				System.out.println("Prêmio de participação!");
				break;
			default:
				System.out.println("Não ganhou prêmio!");
				break;
			}
		}
}