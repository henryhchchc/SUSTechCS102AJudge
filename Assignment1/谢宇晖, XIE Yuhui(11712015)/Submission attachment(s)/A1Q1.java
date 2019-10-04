import java.util.Scanner;
public class A1Q1 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner input=new Scanner(System.in);
	String name;
	int ID;
	System.out.println("Enter name:");
	name =input.nextLine();
	System.out.println("Enter ID:");
	ID=input.nextInt();
	if((ID>=11500000)&&(ID<=11999999)) 
		System.out.println(name+" welcome to SUSTECH Hot Pot Restaurant!");
		else
			System.out.printf("%d\n",ID);
	
		
		
		
		
		
		
		
	}
}


