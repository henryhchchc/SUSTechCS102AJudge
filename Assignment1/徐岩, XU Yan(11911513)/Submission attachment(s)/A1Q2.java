import java.util.Scanner;
public class A1Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c,d,e,f;
		a=input.nextInt();b=input.nextInt();c=input.nextInt();
		d=input.nextInt();e=input.nextInt();f=input.nextInt();
		int mm,ss,second,seconds,waittime;
		second = a*3600+b*60+c;
		seconds = d*3600+e*60+f;
		waittime = seconds - second;
		mm = waittime/60;
		ss = waittime - mm*60;
		if(ss!=0&&mm!=0) {
			System.out.printf("%dm%ds",mm,ss);
		} else if(ss==0&&mm!=0) {
			System.out.printf("%dm",mm);
		}else {
			System.out.printf("%ds",ss);
			} 
	}		
}
		
		
		
		


