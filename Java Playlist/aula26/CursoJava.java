import java.util.Scanner;
public class CursoJava{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		char[] respostas = {'a','b','c','c','a'};
		char[] minhasRespotas = new char[5];
		int pontosFinais=0;
		System.out.println("Digite seu nome: ");
		String nome=scan.nextLine();
		System.out.println("------------------------\nPergunta 1");
		System.out.println("Qual galáxia irá colidir com a Via Láctea?\na)Andrômeda  |  b)Via Láctea  |  c)Terra");
		System.out.println("------------------------");
		minhasRespotas[0]=scan.nextLine().charAt(0);

		System.out.println("------------------------\nPergunta 2");
		System.out.println("Qual o planeta mais quente do sistema solar?\na)Mercúrio  |  b)Vênus  |  c)Terra");
		System.out.println("------------------------");
		minhasRespotas[1]=scan.nextLine().charAt(0);

		System.out.println("------------------------\nPergunta 3");
		System.out.println("Qual é o maior planeta do sistema solar?\na)Terra  |  b)Saturno  |  c)Júpiter");
		System.out.println("------------------------");
		minhasRespotas[2]=scan.nextLine().charAt(0);

		System.out.println("------------------------\nPergunta 4");
		System.out.println("Qual é o nome do Buraco Negro no centro da Via Láctea?\na)Zé Neto  |  b)Cristiano  |  c)Sagittarius A*");
		System.out.println("------------------------");
		minhasRespotas[3]=scan.nextLine().charAt(0);

		System.out.println("------------------------\nPergunta 5");
		System.out.println("O todo o espaço fora da Nuvem de Oort é chamado de?\na)Espaço Interestelar  |  b)Espaço extra-solar  |  c)Espaço extra-Oort*");
		System.out.println("------------------------");
		minhasRespotas[4]=scan.nextLine().charAt(0);
		
		for (int i=0;i<respostas.length;i++){
			if(minhasRespotas[i]==respostas[i]){
				pontosFinais+=2;
			}
		}
		System.out.printf("%nParabéns, %s! Você conseguiu acertar %d questões e contabilizou %d/10 pontos!",nome,pontosFinais/2,pontosFinais);
	}
}