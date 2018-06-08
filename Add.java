package assignmeent;
import java.util.Scanner;
public class Add {
public static int AddNumbers(int x,int y) {
	int c=x+y;
	return c;}
public static void main(String[] args) {
int a,b;
Scanner sc=new Scanner(System.in);
System.out.print("Enter 1st no. ");
a=sc.nextInt();
System.out.print("Enter 2st no. ");
b=sc.nextInt();
sc.close();
int sum=AddNumbers(a,b);
System.out.print("Sum is "+sum);
}
}
