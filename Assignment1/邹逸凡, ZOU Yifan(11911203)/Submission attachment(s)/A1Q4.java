import java.util.Scanner;

public class A1Q4{
	public static void main(String[] args){
		Scanner in =new Scanner (System.in);
		
		double max=0,total=0,t=0,level=0;
		while(in.hasNext()){
			double a   =in.nextDouble();
		 total+=a;
		 t+=1;
		if (a>max){	
			max=a;
	
		}
		}
		
		
	if (t>=2&&total >=800){
		level=1;
	}
	if (max>=1000){
		level=1;
	}
	if (t>=5&&total >=2000){
		level=2;
	}
	if (max>=3000){
		level=2;
	}
	if (t>=10&&total >=5000){
		level=3;
	}
	if (max>=8000){
		level=3;
	}
	
	
	
       if (level==1){
		System.out.println("Silver");
        }
 if (level==2){
		System.out.println("Gold");
        }
		 if (level==3){
		System.out.println("Diamond");
        }
	
	  }
}

