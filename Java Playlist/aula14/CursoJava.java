public class CursoJava{
	public static void main(String[] args){
		Carro c1=new Carro("Golf");
		Carro c2=new Carro("HRV");
		CarroCombate c3=new CarroCombate("Leopardo",100);
		CarroCombate c4=new CarroCombate("Pantera",200);
		
		c1.setLigado(true);
		c1.info();
		c2.info();
		c3.info();
		c4.info();

		for(int i=0;c4.getQtdeArmamento()>0;i++){
			System.out.println("\nAtirando com objeto c4 - 1");
			c4.atirar();
			c4.info();
		}
	}
}