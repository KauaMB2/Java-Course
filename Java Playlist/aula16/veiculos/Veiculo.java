package veiculos;
public class Veiculo{
	//						ATENÇÃO
	//Atributos "protected" só poderão ser acessados por classes qu estão na mesma pasta ou classes que herdam Veiculos
	
	protected String nome;
	protected int tipo;
	public Veiculo(String nome,int tipo){
		this.nome=nome;
		this.tipo=tipo;
	}
	public void info(){
		System.out.printf("%n----------------%n");
		System.out.printf("Nome:%s%n",this.nome);
		System.out.printf("Tipo:%d%n",this.tipo);
	}
}
