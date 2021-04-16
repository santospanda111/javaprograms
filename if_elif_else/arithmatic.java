import java.util.Scanner; class Arithmatic{
	public static void main(String args[]){
		Scanner num=new Scanner(System.in);
		System.out.println("Enter your 1st number: ");
		int a=num.nextInt();
      System.out.println("Enter your 2nd number: ");
      int b=num.nextInt();
      System.out.println("Enter your 3rd number: ");
      int c=num.nextInt();
		int opt1=a+b*c;
		System.out.println(opt1);
		int opt2=a%b+c;
      System.out.println(opt2);
		int opt3=c+a/b;
      System.out.println(opt3);
		int opt4=a*b+c;
      System.out.println(opt4);
		if(opt1>opt2 && opt1>opt3 && opt1>opt4){
			int max=opt1;
			System.out.format("Max= %d %n",max);
		}else if(opt2>opt1 && opt2>opt3 && opt2>opt4){
         int max=opt2;
         System.out.format("max= %d%n",max);
      }else if(opt3>opt1 && opt3>opt2 && opt2>opt4){
         int max=opt3;
         System.out.format("Max= %d%n",max);
		}else{
			int max=opt4;
			System.out.format("max= %d%n",max);
		}
      if(opt1<opt2 && opt1<opt3 && opt1<opt4){
         int min=opt1;
         System.out.format("Min= %d %n",min);
      }else if(opt2<opt1 && opt2<opt3 && opt2<opt4){
         int min=opt2;
         System.out.format("min= %d%n",min);
      }else if(opt3<opt1 && opt3<opt2 && opt2<opt4){
         int min=opt3;
         System.out.format("Min= %d%n",min);
      }else{
         int min=opt4;
         System.out.format("min= %d%n",min);
      }

	}
}
