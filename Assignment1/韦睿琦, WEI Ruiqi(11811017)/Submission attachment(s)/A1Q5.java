
public class A1Q5 {
	
	public static void main(String[] args) {

		int n=args.length;
		int i=0;
		while(n>0) {
			double a=Double.parseDouble(args[i]);
			int b=(int)a;
			int c=(b%1000%100%10);
			if(c==2) {
				a+=4;
				System.out.print(a+" ");
			}
			else if(c==4) {
				a+=5;
				System.out.print(a+" ");
			}
			i++;
			n--;
		}
	}
}