public class Aranha extends Animal{
	private int veneno;
	public Aranha(int vel, int massa, int forca, int veneno){
		super(vel,massa,forca,"Aranha");
		this.veneno=veneno;
	}
	@Override
	public void atacar(Animal a){
		if(this.getVivo()){
			if((this.getForca() + this.veneno) > a.getForca()){
				int novaForca=this.getForca()+a.getMassa();
				this.setForca(novaForca);
				a.setVivo(false);
			}else{
				this.setVivo(false);
			}
			System.out.println("-----------------");
			System.out.println("O animal "+this.getClass().toGenericString()+" atacou "+ a.getClass().toGenericString() +".");
			System.out.println("-----------------");
		}else{
			System.out.println("-----------------");
			System.out.println("O animal "+this.getClass().toGenericString()+" está morto, então não pode atacar.");
			System.out.println("-----------------");
		}
	}
}

