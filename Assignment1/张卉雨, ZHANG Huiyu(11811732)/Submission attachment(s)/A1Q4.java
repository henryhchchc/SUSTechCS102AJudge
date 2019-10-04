

public class A1Q4 {

	public static void main(String[] args) {
		double sum = 0;
		double max=0;
		for(int i=0;i<args.length;i++) {
			if (max<Double.parseDouble(args[i])) {
				max=Double.parseDouble(args[i]);
			}
		}
		if(max>=1000&&max<3000) {
			System.out.print("Silver");
		}else if(max>=3000&&max<8000) {
			System.out.print("Gold");
		}else if(max>=8000) {
			System.out.print("Diamond");
		}else {
			for(int i=0;i<args.length;i++) {
				sum += Double.parseDouble(args[i]);
			}
			if(args.length>=10&&sum>=5000) {
				System.out.print("Diamond");
			}else if(args.length>=5&&sum>=2000) {
				System.out.print("Gold");
			}else if(args.length>=2&&sum>=800) {
				System.out.print("Silver");
			}
		}
	}

}
