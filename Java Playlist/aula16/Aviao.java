import veiculos.Veiculo;
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
	static void criarVeiculo(String nome, int tipo){
		Veiculo v2=new Veiculo(nome,tipo);
		v2.info();
	}
}