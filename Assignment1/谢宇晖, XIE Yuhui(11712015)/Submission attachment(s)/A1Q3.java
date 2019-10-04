import java.util.Scanner;
public class A1Q3 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	double total=0; 
	double am=0;
	double Am=0;
	double p=0;
	System.out.println("Enter price or -1 to quit:");
	double price=in.nextDouble();
	System.out.println("Enter amount or -1 to quit£º");
	double amount=in.nextDouble();{
	while(price!=-1) {
	total+=p;
	
	if((amount*10)%10!=0) {
	am=(amount*10)/10;
	Am=amount-am;
	p=am*price+Am*(price/2+1);
	
	}
	else
    p=amount*price;
	}
	System.out.printf("total",total);
	
	
	
	
}
}
}