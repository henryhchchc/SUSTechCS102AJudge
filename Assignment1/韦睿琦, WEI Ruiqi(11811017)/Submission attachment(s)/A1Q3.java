import java.util.Scanner;
public class A1Q3 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		double total=0;
		//while(input.hasNext()) {
			double prise=input.nextDouble();
			double x=input.nextDouble();
			int x1=(int)x;
			if(x1==x) {
				total=total+prise*x;
			}
			else
				total=total+Math.round(prise/2+1)+prise*x1;
		//}
		System.out.println(total);
	}

}
