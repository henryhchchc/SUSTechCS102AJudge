import java.util.Scanner;
public class A1Q2{
    public static void main(String[] args) {
	int a,b,d,A,B,D;
	Scanner input = new Scanner(System.in);
	a = input.nextInt();b = input.nextInt();d = input.nextInt();
	A = input.nextInt();B = input.nextInt();D = input.nextInt();
	int h,m,s;
	h = 0;m = 0;s = 0;
	if(D < d){
		B--;s=s+60;
	}
	if(B < b){
		A--;m=m+60;
	}
	h = A-a;m = m+B-b+60*h;s = s+D-d;
	if(m==0 && s!=0){
		System.out.printf("%ds",s);// write your code here
	}
	if(s==0 && m!=0){
		System.out.printf("%dm",m);
	}
	if(m==0 && s==0){
		System.out.print("0s");
	}
	if(m!=0 && s!=0){
		System.out.printf("%dm%ds",m,s);
	}
    }
}
