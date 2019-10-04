import java.util.Scanner;
public class A1Q4 {
public static void main(String[]args) {
Scanner input=new Scanner(System.in);
int times=0;
int total=0;
System.out.println("Enter amount or -1 to quit:");
int amount=input.nextInt();{
while (amount!=-1) {
	total+=amount;
	times++;
	System.out.println("Enter amount or -1 to quit:");
	if (amount>=8000)
		System.out.println("Diamond");
	else if((amount>=3000)&&(amount<8000))
	    System.out.println("Gold");
	else if((amount>=1000)&&(amount<3000))
	    System.out.println("Silver");
	amount=input.nextInt();
	
}

	if((times>=10)&&(total>=5000))
			System.out.println("Diamond");
	else if((times>=5)&&(total>=2000))
		System.out.println("Gold");
	else if((times>=2)&&(total>=800))
		System.out.println("Silver");
	
	
}	
	
	
	
}




}






