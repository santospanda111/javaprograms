import java.util.Random;
class flipcoin{
	public static void main(String args[]){
		Random flip=new Random();
		int a=flip.nextInt(2);
		if(a==1){
			System.out.println("Hey! It's a Head.");
		}else{
			System.out.println("ohh! It's a Tail");
		}
	}
}
