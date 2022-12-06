public class Aviao extends Veiculo{
	private int categoria;
	public Aviao(String nome, int categoria){
		super(nome,10);
		this.categoria=categoria;
	}
	public void info(){
		super.info();
		System.out.printf("Categoria:%d%n",this.categoria);
	}
}