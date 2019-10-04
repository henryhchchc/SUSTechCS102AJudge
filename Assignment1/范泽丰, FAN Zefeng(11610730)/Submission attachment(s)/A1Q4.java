import java.util.*;
public class A1Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price = 0;
		int n = 0;
		int l = args.length;
		for(int i = 0;i<l;i++){
			double p = Double.parseDouble(args[i]);
			price = price + p;n++;
		}
		
		if(n>=10&&price>=5000){
			System.out.println("Diamond");
		}else if(n>=5&&price>=2000){
			System.out.println("Gold");
		}else if(n>=2&&price>=800){
			System.out.println("Silver");
		}
		sc.close();
	}

}
