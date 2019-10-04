



public class A1Q4 {
	public static void main(String[] args) {
		int times = 0;
		int sum = 0;
		int single = 0;
		int a = 0;
		int i;
		for ( i=0;i<args.length;i++ ) {
			times++;
			single = Integer.parseInt(args[i]);
			sum = sum + single;
			if (((5 > times && times >= 2) && (2000 > sum && sum >= 800)) || (3000 > single && single >= 1000)) {
				a = 1;
			} else if (((10 > times && times >= 5) && (5000 > sum && sum >= 2000)) || (8000 > single && single >= 3000)) {
				a = 2;
			} else if ((times >= 10 && sum >= 5000) || single >= 8000) {
				a = 3;
			}
		}
		if (a == 1) {
			System.out.printf("Silver");
		} else if (a == 2) {
			System.out.printf("Gold");
		} else if (a == 3) {
			System.out.printf("Diamond");
		}
	}


}
