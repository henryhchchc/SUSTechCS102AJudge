import java.util.Scanner;

public class A1Q2 {
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		int h1;
		int m1;
		int s1;
		int h2;
		int m2;
		int s2;
		System.out.println("h1:");
		h1=input.nextInt();
		System.out.println("m1:");
		m1=input.nextInt();
		System.out.println("s1:");
		s1=input.nextInt();
		System.out.println("h2:");
		h2=input.nextInt();
		System.out.println("m2:");
		m2=input.nextInt();
		System.out.println("s2:");
		s2=input.nextInt();
		int s=3600*(h2-h1)+60*(m2-m1)+s2-s1;
		int M=s/60;
		int S=s%60;
		System.out.printf("%dm %ds\n",M,S);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	}
}
