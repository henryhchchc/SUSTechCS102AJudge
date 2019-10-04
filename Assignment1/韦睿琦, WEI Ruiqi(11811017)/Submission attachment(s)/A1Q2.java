import java.util.Scanner;
public class A1Q2 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		int h1=input.nextInt();
		int m1=input.nextInt();
		int s1=input.nextInt();
		System.out.print("");
		int h2=input.nextInt();
		int m2=input.nextInt();
		int s2=input.nextInt();
		
		int m=60*(h2-h1)+(60-m1)+m2-1;
		int s=s2+(60-s1);
		
		if(h1==h2) {
			m-=60;
		}
		if(s>=60) {
		    m+=1;
		    s-=60;
		    }
			if(m==0 & s==0)
			System.out.print("0s");
		else if(m==0)
			System.out.print(s+"s");
		else if(s==0)
			System.out.print(m+"m");
		else
			System.out.print(m+"m"+s+"s");
   }
}
