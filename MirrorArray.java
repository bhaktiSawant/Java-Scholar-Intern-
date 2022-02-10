import java.util.Scanner;
public class MirrorArray {
	public static boolean checkMirrorArray(int[]a1) {
		boolean flag=true;
		for(int i=0;i<a1.length;i++) {
			if(a1[a1[i]]!=i)
				flag=false;
		}
			
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a1=new int[n];
		for(int i=0;i<n;i++)
			a1[i]=sc.nextInt();
		sc.close();
		boolean result=checkMirrorArray(a1);
		if(result)
			System.out.println("yes");
		else
			System.out.println("No");
	}

}
