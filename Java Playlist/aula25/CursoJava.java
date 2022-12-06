public class CursoJava{
	public static void main(String[] args){
		int[] num=new int[5];
		num[0]=53;
		num[1]=100;
		num[2]=444;
		num[3]=454;
		num[4]=22;
		for(int i=0;i<num.length;i++){
			System.out.printf("%d%n",num[4-i]);
		}
	}
}