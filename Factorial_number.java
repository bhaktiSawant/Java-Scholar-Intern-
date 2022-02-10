import java.util.Scanner;
public class Factorial_number {
	public static int fact(int num) {
		if(num==1)
			return 1;
		return num*fact(num-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		System.out.println(fact(num));
	}

}
