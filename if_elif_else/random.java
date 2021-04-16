import java.util.Random;
class randomnum{
	public static void main(String args[]){
		Random number=new Random();
		int a=number.nextInt(900)+100;
		System.out.format("1st random number is: %d%n",a);
      int b=number.nextInt(900)+100;
      System.out.format("2nd random number is: %d%n",b);
		if(a>b){
			System.out.format("max is: %d%n",a);
			System.out.format("min is: %d%n",b);
		}else{
			System.out.format("max is: %d%n",b);
			System.out.format("min is: %d%n",a);
		}
	}
}
