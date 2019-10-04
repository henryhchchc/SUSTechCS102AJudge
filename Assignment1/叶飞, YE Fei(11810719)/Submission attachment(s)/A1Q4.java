
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class A1Q4 {
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			 String l = sc.nextLine();
			 Scanner scan_l = new Scanner(l);
			int total=0;
			ArrayList<Integer> arr =new ArrayList();
			int count=0;
			while(scan_l.hasNextLine())
			{
				count++;
				arr.add(scan_l.nextInt());
			}
			for (int i=0;i<arr.size();i++)
			{
				 total+=arr.get(i);
			}
			int avg=total/arr.size();
			int max=Collections.max(arr);
			if(arr.size()>=10 || avg>=5000 || max>=8000)  System.out.println("Diamond");
			else if(arr.size()>=5  || avg>=2000 || max>=3000)  System.out.println("Gold");
			else if(arr.size()>=2  || avg>=800 || max>=1000)  System.out.println("Silver");

		}
}
