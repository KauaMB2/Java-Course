abstract class Animal implements SerVivo{	//Define classe abastrata
	private Boolean vivo;
	private int massa;
	private int x;
	private int y;
	private int vel;
	private int forca;
	private String nome;
	public Animal(int vel, int massa, int forca, String nome){
		this.vivo=true;
		this.massa=massa;
		this.x=0;
		this.y=0;
		this.forca=forca;
		this.vel=vel;
		this.nome=nome;
	}
	public void setVivo(boolean vivo){
		this.vivo=vivo;
	}
	public Boolean getVivo(){
		return this.vivo;
	}
	public void setForca(int forca){
		this.forca=forca;
	}
	public int getForca(){
		return this.forca;
	}
	public void setMassa(int massa){
		this.massa=massa;
	}
	public int getMassa(){
		return this.massa;
	}
	public String getNome(){
		return this.nome;
	}
	public void atacar(Animal a){
		if(this.vivo){
			if(this.forca > a.getForca()){
				this.forca+=a.getMassa();
				a.vivo=false;
			}else{
				this.vivo=false;
			}
			System.out.println("-----------------");
			System.out.println("O animal "+this.getNome()+" atacou "+ a.getNome() +".");
			System.out.println("-----------------");
		}else{
			System.out.println("-----------------");
			System.out.println("O animal "+this.getNome()+" está morto, então não pode atacar.");
			System.out.println("-----------------");
		}
	}
	public void atacar(Vegetal a){
		if(this.vivo){
			if(this.forca > a.getForca()){
				this.forca+=a.getMassa();
				a.setVivo(false);
			}else{
				this.setVivo(false);
			}
			System.out.println("-----------------");
			System.out.println("O animal "+this.getNome()+" atacou "+ a.getNome() +".");
			System.out.println("-----------------");
		}else{
			System.out.println("-----------------");
			System.out.println("O animal "+this.getNome()+" está morto, então não pode atacar.");
			System.out.println("-----------------");
		}
	}
	public void mover(){
		if(this.vivo){
			this.x+=this.vel;
			this.y+=this.vel;
		}
	}
	public void comer(int massa){
		if(this.vivo){
			this.forca+=massa;
		}else{
			System.out.println("-----------------");
			System.out.println("O animal "+this.getClass().toGenericString()+" está morto, então não pode comer.");
			System.out.println("-----------------");
		}
	}
	public void info(){
		System.out.printf("Tipo..:%s%n",this.getClass().toString());
		System.out.printf("Vivo..:%s%n",this.getVivo() ? "Sim":"Não");
		System.out.printf("Massa.:%s%n",this.massa);
		System.out.printf("Vel...:%s%n",this.vel);
		System.out.printf("Forca..:%s%n",this.forca);
		System.out.println("-----------------");
	}

}