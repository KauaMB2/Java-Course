public class Jogador{
	private final int maxVidas=5;
	static boolean alerta=false;
	static int pontosJogadores=0;
	private int qtdJogadores=0;
	private int num=0;
	private int vidas;//ATRIBUTO this.vida


	public Jogador(int num){
		this.vidas=3;
		this.num=num;
		qtdJogadores++;
		System.out.printf("Jogador Nmr %d criado%n",num);
	}
	public int getVidas(){
		return this.vidas;
	}
	public void setVidas(int vidas){
		if(vidas >=maxVidas){
			this.vidas=maxVidas;
		}else if(vidas<0){
			this.vidas=0;
		}else{
			this.vidas=vidas;
		}
	}
	static void addPontos(){
		pontosJogadores+=10;
	}
	public void addVidas(int novaVida){
		if(novaVida>=maxVidas){
			this.vidas=maxVidas;
		}
	}
	public void info(){
		System.out.printf("%nJogador: %d",this.num);
		System.out.printf("%nVidas: %d",this.vidas);
		System.out.printf("%nAlerta: %s",(alerta ? "Sim":"Não"));
		System.out.printf("%nJogadores:%d",qtdJogadores);
		System.out.printf("%nPontos Jogadores:%d",pontosJogadores);
		System.out.printf("%n--------------------");
	}
}