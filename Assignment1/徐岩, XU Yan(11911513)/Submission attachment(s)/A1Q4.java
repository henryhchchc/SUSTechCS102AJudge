public class A1Q4 {
	public static void main(String[] args) {
	    double total = 0;
		double length = args.length;
		for(int i = 0; i< args.length;i++) {
			double a = Double.parseDouble(args[i]);
		    total += a;
		}
        double max =  Double.parseDouble(args[0]);
		for(int i = 1; i < length;i++) {
			double b = Double.parseDouble(args[i]);
			if (b > max) max = b ;
			}
		if((length >= 10 && total >= 5000) || max >=8000) {
			System.out.println("Diamond");
		}else if((length >= 5 && total >= 2000) || max >= 3000 ){
			System.out.println("Gold");
		}else if((length >= 2 && total >= 800) || max >= 1000 ) {
			System.out.println("Silver");
		}
	}
}
