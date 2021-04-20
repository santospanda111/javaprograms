import java.util.Scanner;
class add{
public static void main(String args[]){
Scanner a=new Scanner(System.in);
System.out.println("Enter your number: ");
int number=a.nextInt();
int sum=0;
int i=1;
for(i=1;i<=number;i++){
	sum=sum+i;
}
System.out.println(sum);
}
}

