
import java.util.Scanner;
public class A1Q4{

    public static void main(String[] args){
    Scanner in =new Scanner(System.in);
	int n=0,a=0,b=0,c=0,d=0,total=0,price;
	for(String s:args){
	price =Integer.parseInt(s);
        d = price;
		if (price >= 8000) {
			a=a+1;
		} else if (price >= 3000) {
			b=b+1;
		} else if (price >= 1000) {
			c=c+1;
		}
		n=n+1;
		total = total+d;}


	if((n>=10&&total>=5000)||a>=1)System.out.print("Diamond");
   else if((n>=5&&total>=2000)||b>=1)System.out.print("Gold");
   else if((n>=2&&total>=800)||c>=1)System.out.print("Silver");
    }
}
