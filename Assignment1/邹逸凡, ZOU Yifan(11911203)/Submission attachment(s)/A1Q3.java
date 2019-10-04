import java.util.Scanner;

public class A1Q3{
	public static void main(String[] args){
		Scanner in =new Scanner (System.in);
		double price=0;
		while(in.hasNext()){
			double a   =in.nextDouble();
			double b   =in.nextDouble();  

		if (b*2%2==1){	
			price+= (double)Math.round((a*b)*10)/10+1 ;
		}else{
			price+=a*b;
		}
		}
		
		price=(double)Math.round(price*10)/10;
	System.out.println( price );
      
	  }
}

