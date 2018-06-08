package assignmeent;
import java.util.Scanner;
public class Leap_year {
public static int year(int x) {
	int result;
	   result=x%4;
	   return result;
}
public static void main(String [] args) {
	int a;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a year " );
    a=sc.nextInt();
    int leap=year(a);
    if(leap==0)
    	 System.out.print("Leap year" );
    else
    	 System.out.print("Not a Leap year" );
}
}
