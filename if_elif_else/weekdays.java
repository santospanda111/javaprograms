import java.util.Scanner;
class weekdays{
	public static void main(String args[]){
		Scanner num=new Scanner(System.in);
		System.out.println("Enter your number to display weekdays: ");
		int number=num.nextInt();
		if(number==1){
			System.out.println("Sunday");
		}else if(number==2){
			System.out.println("Monday");
		}else if(number==3){
			System.out.println("Tuesday");
		}else if(number==4){
			System.out.println("Wednesday");
		}else if(number==5){
			System.out.println("Thursday");
		}else if(number==6){
			System.out.println("Friday");
		}else if(number==7){
			System.out.println("Saturday");
		}else{
			System.out.println("A week has 7days!!");
			System.out.println("Please Enter a number between 1 to 7");
		}
	}
}
