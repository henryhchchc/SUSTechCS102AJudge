
public class A1Q4 {

	public static void main(String[] args) {

		int n=args.length;
		int i=0;
		int j=n;
		int b=0;
		int c=0;
		while(n>0) {
			int a=Integer.parseInt(args[i]);
			if(a>=8000) {
				c=1;
			}
			else if(a>=3000) {
				c=2;
			}
			else if(a>=1000) {
				c=3;
			} 
			b+=a;
			i++;
			n--;
		}
		if((j>=10 & b>=5000) | c==1) {
			System.out.print("Diamond");
		}
		else if((j>=5 & b>=2000) | c==2) {
			System.out.print("Gold");
		}
		else if((j>=2 & b>=800) | c==3) {
			System.out.print("Silver");
		}
		else System.out.print("");
	}

}
