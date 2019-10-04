import java.util.Scanner;

public class A1Q2{
	public static void main(String[] args){
		Scanner in =new Scanner (System.in);
		
       int a1		  =in.nextInt();
	   int a2		  =in.nextInt();
	   int a3		  =in.nextInt();
	   int b1		  =in.nextInt();
	   int b2		  =in.nextInt();
	   int b3		  =in.nextInt();
	   
	   
	  int s1=b1-a1;
	  int s2=b2-a2;
	  int s3=b3-a3;
	   if (s3<0){
      s2=s2-1;
	  s3=s3+60;
		 }
	   s2=s2+s1*60;
	   
         if (s2==0){
			System.out.println(s3+"s"); 
		 }
		else if (s3==0){
			System.out.println(s2+"m"); 
		 }
		 
		 if (s2!=0&&s3!=0){
			System.out.println(s2+"m"+s3+"s"); 
		 }
	  }
}
