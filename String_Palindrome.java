import java.util.Scanner;
public class Diamond_Pattern {
	static void Diamond(int n)
    {
        int s = n - 1;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < s; j++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
     
            System.out.print("\n");
            s--;
        }
        s = 0;
        for (int i = n; i > 0; i--)
        {
            for (int j = 0; j < s; j++)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print("* ");
     
            System.out.print("\n");
            s++;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		 Diamond(n);
	}

}
