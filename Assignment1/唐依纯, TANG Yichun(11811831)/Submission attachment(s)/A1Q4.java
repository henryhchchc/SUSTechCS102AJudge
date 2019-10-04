
public class A1Q4 {
    public static void main(String[] args) {
    	int i;
		double total =0 ;
		double max = 0;
		for(i=0;i<args.length;i++) {
			total = total + Double.valueOf(args[i]);
			
			if(max<Double.valueOf(args[i])) {
				max = Double.valueOf(args[i]);
			}
		}
		if ((args.length>=10 && total>=5000)||max>=8000) {
			System.out.println("Diamond"); 
		}    	
		else if ((args.length>=5 && total>=2000)||max>=3000) {
			System.out.println("Gold"); 
		}    	
		else if ((args.length>=2 && total>=800)||max>=1000) {
			System.out.println("Silver"); 
		}   
       	}
       }