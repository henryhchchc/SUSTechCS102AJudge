
import java.util.Scanner;

public class A1Q3 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			double all=0;
			while(!sc.hasNext("0")){
			double doubleprice =sc.nextDouble();
			int intprice =(int)Math.ceil(doubleprice);
			double doublenum=sc.nextDouble();
			int intnum =(int) doublenum;
			if(intnum == doublenum)
				all=all+(doubleprice*doublenum);
			else
				all=all+(doubleprice*intnum+intprice*0.5+1);
			}
			System.out.println(all);
			System.out.println("END");
		}	
}
