import java.util.Scanner;
class ReverseNum
{
public static void main(String[] args)
{
Scanner a=new Scanner(System.in);
System.out.println("Enter your number: ");
int number = a.nextInt();
int reverse = 0;
while(number != 0)
{
int remainder = number % 10;
reverse = reverse * 10 + remainder;
number = number/10;
}
System.out.println("The reverse of the given number is: " + reverse);
}
}
