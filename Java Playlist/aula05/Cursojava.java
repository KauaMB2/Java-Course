public class CursoJava{
	public static void main(String[] args){
		int[] num=new int[5];
		int[] numeros={10,20,30,40,50};
		num[0]=10;
		num[1]=50;
		num[2]=250;
		num[3]=1250;
		num[4]=6250;
		for(int i=0;i<numeros.length;i++){
			System.out.printf(" - %d",num[i]);
		}
	}
}