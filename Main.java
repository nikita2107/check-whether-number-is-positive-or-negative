import java.util.Scanner;
class Main
{
	public static void main(String[] args){
	
	int num;
	System.out.println("Enter a number");
	Scanner r = new Scanner(System.in);
	num = r.nextInt();

	if(num>0)
	{
		System.out.println("Number Is Positive");
	}
	else if(num<0)
	{
		System.out.println("Number Is Negative");
	}
	else
	{
		System.out.println("Number is zero");
	}
}
}