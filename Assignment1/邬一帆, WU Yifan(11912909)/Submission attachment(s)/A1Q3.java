import java.util.Scanner; 
public class A1Q3 { 
   public static void main(String[] args) {
		double total=0;
	   	Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			double price = in.nextDouble();
			double terns = in.nextDouble();
			for (;terns>1;terns--){
				total = total + price;
			}
			if (terns<1){
				price = ((price/2)+1);
				double a=0;
				double b=0;
				a=price*1000;
				b=a%100;
				if (b>=50){
					total=total + ((a-b)/1000)+0.1;
				}
				else {
					total=total + ((a-b)/1000);
				}
			}
			if (terns==1){
				total = total + price;
			}
		}
		System.out.printf("%.1f",total);
   }
}
