package self_ordering_system;

import java.util.ArrayList;
import java.util.Scanner;

public class A1Q5 {

	private String MenuPrice ;
	public A1Q5()
	{
		
	}
	
	private void ScanInput()
	{
		 Scanner in=new Scanner(System.in);//通过new Scanner(System.in)创建一个Scanner，控制台会一直等待输入，直到敲回车键结束，把所输入的内容传给Scanner
			System.out.println("please input the A1Q5 data");
		while( in.hasNext() )
		{
			in.useDelimiter("\n");
			MenuPrice = in.next() ;
			CheckMenuPrice() ;
			break ;
		}
		System.out.println("End");
	}
	
	private void CheckMenuPrice()
	{
	 int mPos = 0 ;
   	 int nPos = 0 ;
   	 String price = this.MenuPrice ;
   	 String space = " " ;
   	 int totalConSume = 0 ; //消费总价值
   	 int consumeNum = 0 ; //消费次数
   	 int maxAcount = 0 ;
   	 while( nPos >= 0 )
   	 {
   		 String value = "" ;
   		 nPos = price.indexOf(space,mPos) ;
   		 if( nPos < 0 ) {
   			 if( mPos == price.length()) break ;
   			 value = price.substring(mPos, price.length()-1) ;
   		 }
   		 else
   		 {
   		     value = price.substring(mPos, nPos) ;
   		 }
   		 int kPos = value.indexOf(".") ;
   		 if( kPos > 0 )
   		 {
   			 String sBit = value.substring(kPos-1, kPos) ;
   			 if( sBit.equals("4") ) //个位数为4的，需要修改成9
   			 {
   				 float fPrice = Float.valueOf(value) ;
   				 fPrice += 5 ; //因为要改成9.只需要+5就可以了
   				 sBit = String.valueOf(fPrice) ;
   				 //输出
   				System.out.println(sBit);
   			 }
   			 if( sBit.equals("2"))//个位数为2的，需要修改成6
   			 {
   				float fPrice = Float.valueOf(value) ;
  				 fPrice += 4 ; //因为要改成6.只需要+4就可以了
  				 sBit = String.valueOf(fPrice) ;
  				 //输出
  				System.out.println(sBit);
   			 }
   		 }
         if( nPos < 0 ) break ;
   	     mPos = nPos+space.length() ; 
   	 }
	}
	
	 public static void main(String[] args) 
	 {
		 A1Q5 a5 = new A1Q5() ;
		 a5.ScanInput();
	 }
}
