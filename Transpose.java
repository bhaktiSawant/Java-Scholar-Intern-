import java.util.Scanner;
public class Transpose {
	public static void transpose_Array(int[][]a,int m,int n) {
		for(int i=0;i<m;i++) {
			for(int j=i+1;j<n;j++) {
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of 2d array:");
		System.out.print("m:");
		int m=sc.nextInt();
		System.out.print("n:");
		int n=sc.nextInt();
		int[][]a= new int[m][n];
		System.out.println("Array elements:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		sc.close();
		System.out.println("Transpose:");
		transpose_Array(a,m,n);
		}
	}

