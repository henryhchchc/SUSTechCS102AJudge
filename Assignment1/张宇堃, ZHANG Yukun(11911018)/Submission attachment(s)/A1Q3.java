import java.util.Scanner;
public class A1Q3 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double sum =0;
	while(in.hasNext()){
	    double price = in.nextDouble();
		double piece = in.nextDouble();
		double multiple = price*piece;
		long j = Math.round(piece);
		if(j >piece){
		    sum +=multiple +1.05;
        }
		else{
		    sum +=multiple;
        }// write your code here
    }
	System.out.printf("%.1f",sum);
    }
}
