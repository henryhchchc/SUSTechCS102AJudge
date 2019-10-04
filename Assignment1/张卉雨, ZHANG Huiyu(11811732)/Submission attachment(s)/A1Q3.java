
import java.util.Scanner;

public class A1Q3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double total=0;
		while (in.hasNext()){
			double price= in.nextDouble();
			double piece= in.nextDouble();
			if (piece%1!=0) {
				total = total+Math.round((price/2 + 1)*10)/10.0+price*(piece-0.5);
			}else
				total = total+price*piece;
		}
		System.out.println(total);
		in.close();
	}

}
