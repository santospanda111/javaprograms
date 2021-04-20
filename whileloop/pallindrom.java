import java.util.Scanner;
class pallindrom
{
public static void main(String[] args)
{
Scanner a=new Scanner(System.in);
System.out.println("Enter your number: ");
int number =a.nextInt();
int temp=number;
int reverse = 0;
while(number != 0)
{
int remainder = number % 10;
reverse = reverse * 10 + remainder;
number = number/10;
}

System.out.println(reverse);
if( temp == reverse)
	System.out.println("It's a Pallindrom.");
else
	System.out.println("It's not a Pallindrom");

}
}
