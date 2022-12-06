import java.util.*;

public class Calc{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		scan.useLocale(Locale.US);//Configura a linguagem para o Inglês(Necesário para utilizar entrar com valores float. Ex 3.7)
		Numero n1=new Numero();
		Numero n2=new Numero();
		Numero res=new Numero();

		char opc='s';
		while(opc=='s' || opc=='S'){
			System.out.printf("%nDigite o valor 1: ");
			n1.setValor(scan.nextFloat());
			System.out.printf("%nDigite o valor 2: ");
			n2.setValor(scan.nextFloat());
			res.setValor(n1.getValor() + n2.getValor());
			System.out.printf("%nSoma: %.2f",res.getValor());
			System.out.printf("%nDigite \"S\" para somar novamente - ");
			opc=scan.next().charAt(0);
			System.out.print("\n\n\n\n\n");
		}
	}
}