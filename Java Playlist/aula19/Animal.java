abstract class Animal implements SerVivo{	//Define classe abastrata
	private int vel;
	private int massa;
	private int forca;
	public Animal(int vel, int massa, int forca){
		this.vel=vel;
		this.massa=massa;
		this.forca=forca;
	}
	public void mover(){

	}
	public void comer(int massa){

	}
	public void info(){

	}
	public int getForca(){
		return this.forca;
	}
}
