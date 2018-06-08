package assignmeent;
import java.util.Scanner;
public class Big {
	public static int large(int x,int y,int z) {
		if(x>y&&x>z)
			return x;
		else if(y>x&&y>z)
			return y;
		else
			return  z;
	}
public static void main(String [] args) {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter 1st no. :- ");
	a=sc.nextInt();
	System.out.print("Enter 2nd no. :- ");
	b=sc.nextInt();
	System.out.print("Enter 3rd no. :- ");
	c=sc.nextInt();
	sc.close();
	int number=large(a,b,c);
	System.out.print("Largest no. is:-  "+number);
		
}
}
