import java.util.Scanner;
public class Fibonacci_Series {
	public static void fib(int n) {
		int n1=0,n2=1;
		System.out.print(n1+" "+n2+" ");
		int n3=0;
		for(int i=3;i<=n;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		fib(n);
	}

}
