public class CarroCombate extends Carro{//Se torna heideiro da classe Carro
	private final int MAX_ARMAMENTO=150;
	private final int MIN_ARMAMENTO=0;
	private int qtdeArmamento;
	public CarroCombate(String nome,int blindagem){
		super(nome);//Passa parâmetros para o método construtor da classe pai
		setArmamento(true);//Método da classe pai
		setBlindagem(blindagem);//Método da classe pai
		this.qtdeArmamento=5;
	}
	public void setQtdeArmamento(int tiroDesconto){
		this.qtdeArmamento+=tiroDesconto;
		if(this.qtdeArmamento>MAX_ARMAMENTO){
			System.out.print("MAX");
			this.qtdeArmamento=MAX_ARMAMENTO;
		}
		if(this.qtdeArmamento<MIN_ARMAMENTO){
			System.out.print("MAX");
			this.qtdeArmamento=MIN_ARMAMENTO;
		}
	}
	public int getQtdeArmamento(){
		return this.qtdeArmamento;
	}
	public void atirar(){
		if(this.qtdeArmamento>MIN_ARMAMENTO){
			setQtdeArmamento(-1);
		}else{
			System.out.println("Sem armamento");
		}
	}
	public void info(){
		super.info();
		System.out.printf("Qtde.Arm......:%d%n",this.qtdeArmamento);
	}
}