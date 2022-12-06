import java.util.Arrays;
public class CursoJava{
	public static void main(String[] args){
		AnimalChefao a0=new AnimalChefao();
		Sapo a1=new Sapo(10,60,10);
		a1.info();
		Aranha a2=new Aranha(5,30,5,3);
		a2.info();
		Formiga a3=new Formiga(2,20,2);
		a3.info();
		Vegetal a4=new Vegetal(1);
		a4.info();
		Vegetal a5=new Vegetal(5);
		a5.info();
		Vegetal a6=new Vegetal(10);
		a6.info();
		Formiga a7=new Formiga(2,10,2);
		a7.info();

		System.out.println(a7.getForca());
		a7.atacar(a0);
		a7.atacar(a5);
		a7.atacar(a4);
		a7.atacar(a3);
		a7.atacar(a2);
		a7.atacar(a1);
		a7.atacar(a0);

		System.out.println(a7.getForca());
		System.out.println(a0.getVivo());
	}
}