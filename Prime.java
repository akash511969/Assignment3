package assignmeent;
import java.util.Scanner;
public class Prime {
	public static int Isprime(int x) {
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
				return 0;     //Not prime
		}
				return 1;     //Prime
				
	}
	public static void main(String [] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no. :- ");
		a=sc.nextInt();
		sc.close();
		int result=Isprime(a);
		if(a==0||a==1)
			System.out.print("Smallest prime no. is 2");
		else if(result==0)
			System.out.print("Not prime");
		else
			System.out.print("prime");
		}
}
