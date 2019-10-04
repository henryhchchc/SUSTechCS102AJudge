

public class A1Q5 {
	public static void main(String[] args) {
		int i ;
		for (  i=0;i<args.length;i++ ) {
			float c =Float.parseFloat(args[i]);
			int a = (int)c;
			int b =a%10;
			if(b==2) {
				c=c+4;
				System.out.println(c);
			}else if(b==4) {
				c=c+5;
				System.out.println(c);
			}
			
	
		}
	}


}
