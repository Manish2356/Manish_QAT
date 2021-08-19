package room.asiignment;
import java.math.*;
public class arithmetic_ops {
private static double num = 9.0;
	
	public static boolean isZero(double num) {
		if(num==0)
			System.out.println(num+" is zero");
		return true;
	}
	
	public static boolean isPositive(double num) {
		if(num>0)
			System.out.println(num+" is positive");
		return true;
	}
	
	public static boolean isNegative(double num) {
		if(num<0)
			System.out.println(num+" is negative");
		return true;
	}
	
	public static boolean isOdd(double num) {
		if(num%2 != 0)
			System.out.println(num+" is odd");
		return true;
	}
	
	public static boolean isEven(double num) {
		if(num%2 == 0)
			System.out.println(num+" is even");
		return true;
	}
	
	public static boolean isPrime(double num) {
		int count=0;
			for(int i=1;i<=num;i++)
			{
				if(num%i == 0)
					count++;
			}
			
			if (count == 2)
				System.out.println(num+" is prime");
			return true;
	}
	
	public static boolean isArmstrong(double num) {
		int sum=0;
		double n = num;
		while(num>0)
		{
			double rem = num%10;
			sum+=(rem*rem*rem);
			//System.out.println(sum);
			num=num/10;
			
		}
		if (sum==n)
			System.out.println(sum+" is Armstrong number");
		return true;
	}
	
	public static void getFactorial(double num) {
		double fact=1;
		for(int i=1;i<=num;i++)
			fact=fact*i;
		System.out.println(fact+" is factorial");
	}
	
	public static void getSqrt(double num)
	{
		double sqrt = Math.sqrt(num);
		System.out.println(sqrt+" square root is");
	}
	
	public static void getSqr(double num)
	{
		double sqr = num*num;
		System.out.println(sqr+" is the square");
	}
	
	public static void sumDigits(double num)
	{
		double sum=0, rem=0;
		while(num>0.0)
		{
			rem=num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println(sum+" is the sum of digits");
	}
	
	public static void getReverse(double num)
	{
		double rem=0, rev=0;
		while(num!=0.0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println(rev+" is the reverse of the number");
	}
	
	public static void main(String[] args)
	{
		isZero(num);
		isPositive(num);
		isNegative(num);
		isOdd(num);
		isEven(num);
		isPrime(num);
		isArmstrong(num);
		getFactorial(num);
		getSqrt(num);
		sumDigits(num);
		getReverse(num);
	}
	
}
