public class Animal implements SerVivo{//Implementa a interface SerVivo em Animal

	public Animal(){}

	public void mover(){}
	public void comer(int massa){}
	public void info(){
		System.out.printf("Vivo: %s%n",this.vivo ? "Sim" : "Não");
	}
}

