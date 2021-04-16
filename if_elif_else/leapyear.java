import java.util.Scanner;
class leap{
	public static void main(String args[]){
		Scanner year=new Scanner(System.in);
		System.out.println("Enter your year to check: ");
		int a=year.nextInt();
		if(a%4==0 || a%100==0 || a%400==0){
			System.out.println("It is a leap year.");
		}else{
			System.out.println("It isn't a leap year");
		}
	}
}
