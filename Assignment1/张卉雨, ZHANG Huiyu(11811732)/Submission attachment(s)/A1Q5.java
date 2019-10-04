
public class A1Q5 {

	public static void main(String[] args) {
		int i=0;
		double price;
		double m=1;
		double pri;
		for(i=0;i<args.length;i++) {
			price=Double.parseDouble(args[i]);
			pri=price*10;
			pri=(int)pri/10;
				m=pri%10;
				if (m==2) {
					price=price+4;
				}else if(m==4) {
					price=price+5;
				}			

			if (price!=Double.parseDouble(args[i]))
			System.out.printf("%s ",price);			
		}
//			for(int i=0;i<args.length;i++) {
//				double price=Double.parseDouble(args[i]);
//				if((int)price % 10 == 4) price += 5;
//				else if((int)price % 10 == 2) price += 4;
//				if (price!=Double.parseDouble(args[i]))
//				System.out.printf("%s\t\n",price);
//			}
	}

}
