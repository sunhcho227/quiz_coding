import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		
		for(int i=a;i>=1;i--) {
			int j=1;
			for(j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=a-j;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}