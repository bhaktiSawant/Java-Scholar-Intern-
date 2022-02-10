import java.util.Scanner;
public class ReverseString {
	public static String reverseString(String s) {
		char[]a1=s.toCharArray();
		char[]a2=new char[a1.length];
		int j=0;
		for(int i=a1.length-1;i>=0;i--)
			a2[j++]=a1[i];
		String new_s=new String(a2);
		return new_s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(reverseString(s));
		sc.close();
	}

}
