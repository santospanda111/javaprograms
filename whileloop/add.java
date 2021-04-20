import java.util.Scanner;
class add{
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n=a.nextInt();
		int sum=0;
		int i=1;
		while(i<=n){
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}
}
