public class A1Q5 { 
	public static void main(String[] args) {
		for (int i=0;i<args.length;i++){
			float price =Float.parseFloat(args[i]);
			int oct = (int)(price*10);
			int jan = ((oct-(oct%10))/10)%10;
			if(jan==2){
			price=price+4;
			System.out.printf("%.1f ",price);}
			if(jan==4){
			price=price+5;
System.out.printf("%.1f ",price);}}}}