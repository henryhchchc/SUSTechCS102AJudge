
import java.util.*;
public class A1Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	    int hhb = input.nextInt();
	    int mmb = input.nextInt();
	    int ssb = input.nextInt();
	    int hhe = input.nextInt();
	    int mme = input.nextInt();
	    int sse = input.nextInt();
	    int begin = hhb*3600+mmb*60+ssb;
	    int end = hhe*3600+mme*60+sse;
	    
	    int time = end - begin;
	    if(time>= 60){
	     if(time%60 == 0){
	      System.out.printf("%dm\n",time/60);
	     }else{
	      System.out.printf("%dm%ds\n",(time - time%60)/60,time%60);
	     }
	    }else{
	     System.out.printf("%ds\n",time);
	    }
input.close();
	   }
	  }