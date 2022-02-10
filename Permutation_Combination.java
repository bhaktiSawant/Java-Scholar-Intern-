import java.util.Scanner;
public class Permutation_Combination {
	public static int fact(int n) {
		if(n==1)
			return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		sc.close();
		int per=fact(n)/fact(n-r);
		int com=fact(n)/(fact(r)*fact(n-r));
		System.out.println("Permutation:"+per+"\nCombination:"+com);
		
	}

}
