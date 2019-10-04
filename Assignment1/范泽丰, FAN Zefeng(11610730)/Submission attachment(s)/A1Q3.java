import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.*;
public class A1Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price = 0;
		    NumberFormat nf = NumberFormat.getNumberInstance();
			nf.setMaximumFractionDigits(1);
			nf.setMinimumFractionDigits(1);
			nf.setRoundingMode(RoundingMode.UP);
		while(sc.hasNext()){
			double p = sc.nextDouble();
			String n = sc.next();
			int n0 ;
			if(n.contains(".")){
				int l = n.length()-2;
				String n1 = n.substring(0, l);
				n0 = Integer.parseInt(n1);
				price = price + (p*n0) + (p/2+1);
				price = Double.valueOf(nf.format(price));
			}else{
				n0 = Integer.parseInt(n);
				price = price + (p*n0);
				price = Double.valueOf(nf.format(price));
			}
		}
			 System.out.println(nf.format(price));
			 sc.close();
	}

}
