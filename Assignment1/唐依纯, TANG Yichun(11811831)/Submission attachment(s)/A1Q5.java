
public class A1Q5 {
	public static void main(String[] args) {
		
		int i;
		for(i=0;i<args.length;i++) {	
			double m = Double.parseDouble(args[i]);
			int n = (int)m;
				if(n%10 == 2) {
					m = m +4;
					System.out.print(m + " "); 
				}
				else if (n%10==4) {
					m = m + 5;
					System.out.print(m+ " "); 
				}
			}		
		}
}