import java.util.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class A1Q2 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat newdate = new SimpleDateFormat("HH:mm:ss");
		String time1= sc.nextLine(); time1=time1.replaceAll(" ", ":");  Date dt1 = newdate.parse(time1);
		String time2= sc.nextLine(); time2=time2.replaceAll(" ", ":");  Date dt2 = newdate.parse(time2);
		
		sc.close();
		
		long start = dt1.getTime();
		long end = dt2.getTime();long x;
		if(time1.equals(time2)){x=0;}else{
		x = end-start;}
		long m0 = (long)(x/(60*1000));
		long s0 = (long)(x/(1000)-m0*60);
		
		
		
		if(m0==0&&s0==0){
			System.out.print("0s");
		}else if(m0==0&&s0!=0){
		System.out.print(s0+"s");}
		else if(m0!=0&&s0==0){
			System.out.print(m0+"m");
		}else{
			System.out.print(m0+"m"+s0+"s");
		}
		
	}

}
