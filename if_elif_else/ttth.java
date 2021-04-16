import java.util.Scanner;
class unit{
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num=a.nextInt();
		if(num==1){
			System.out.println("It is a Unit.");
		}else if(num==10){
			System.out.println("It is a Ten.");
		}else if(num==100){
			System.out.println("It is a Hundred.");
		}else if(num==1000){
			System.out.println("It is a Thousand.");
		}else if(num==10000){
			System.out.println("It is Ten Thousand.");
		}else{
			System.out.println("Invalid Input");
		}
	}
}
