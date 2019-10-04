

import java.util.ArrayList;
import java.util.Scanner;

public class A1Q5 {
    public static void main(String[] args) {
    	ArrayList<Double> arr =new ArrayList();
    	 Scanner sc =new Scanner(System.in);
		 String l = sc.nextLine();
		 Scanner scan_l = new Scanner(l);
		 while(scan_l.hasNextLine())
			{
			 	arr.add(scan_l.nextDouble());
			}
		 for(int i=0;i<arr.size();i++)
		 {
			 Double num=arr.get(i);
			 int intnum =num.intValue();
			 if(intnum % 10 ==2)  num=num+4;
			 else if(intnum % 10 ==4)  num=num+5;
			 arr.set(i, num);
			 System.out.println(num);
		 }
		 
	}
}
