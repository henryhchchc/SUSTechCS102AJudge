public class A1Q5 {
	public static void main(String[] args) {
		for(int i = 0; i< args.length;i++) {
			double a = Double.parseDouble(args[i]);
			int b = (int)a;
			int c = b % 10;
			if(c == 2) {
				a = a + 4; 
				System.out.printf("%.1f ",a);
			}else if(c == 4) {
				a = a + 5;
				System.out.printf("%.1f ",a);
			}
		}
	}
}


