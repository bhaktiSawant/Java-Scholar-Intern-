import java.util.Scanner;
public class Calculator {
	public static double calculate(double a,char op,double b) {
		double res=0;
		switch(op) {
		case '+':
			res=a+b;
			break;
		case '-':
			res=a-b;
			break;
		case '*':
			res=a*b;
			break;
		case '/':
			res=a/b;
			break;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		char op=sc.next().charAt(0);
		double b=sc.nextInt();
		sc.close();
		System.out.printf("%.2f",calculate(a,op,b));
	}

}

