import java.util.Scanner;
class reverse
{
public static void main(String[] args)
{
Scanner a=new Scanner(System.in);
System.out.println("Enter your number: ");
int number = a.nextInt(), reverse = 0;
for(;number != 0; number=number/10)
{
int remainder = number % 10;
reverse = reverse * 10 + remainder;

}
System.out.println("The reverse of the given number is: " + reverse);
}
}
