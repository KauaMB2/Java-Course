public class Vegetal{
	private Boolean vivo;
	private int massa;
	private static String nome;
	private int forca;
	public Vegetal(int massa){
		this.vivo=true;
		this.massa=massa;
		this.nome="Vegetal";
		this.forca=1;
	}
	public int getMassa(){
		return this.massa;
	}
	public void setVivo(boolean vivo){
		this.vivo=vivo;
	}
	public Boolean getVivo(){
		return this.vivo;
	} 
	public int getForca(){
		return this.forca;
	}
	public String getNome(){
		return this.nome;
	}
	public void info(){
		System.out.printf("Tipo..:%s%n",this.getNome());
		System.out.printf("Vivo..:%s%n",this.vivo ? "Sim":"Não");
		System.out.printf("Massa.:%s%n",this.massa);
		System.out.println("-----------------");
	}
}