import java.util.Scanner; 
public class A1Q2 { 
   public static void main(String[] args) {
		int[] time_start = new int[3];
		int[] time_finish =  new int[3];
		Scanner s = new Scanner(System. in );
		for (int i=0;i<3;i++){
			time_start[i] = s.nextInt();
		}
		for (int j=0;j<3;j++){
			time_finish[j] = s.nextInt();
		}
		s.close(); 
		int hour=0;
		int minute =0;
		int second =0;
		hour = time_finish[0] - time_start[0];
		minute = time_finish[1] - time_start[1];
		second = time_finish[2] - time_start[2];
		if (hour>0){
		minute = minute + (hour*60);
		}
		if (second<0){
			minute=minute - 1;
			second = second + 60;
		}
		if (minute==0&second==0){
			System.out.println("0s");
		}
		else{
			if(second==0){
				System.out.printf("%dm",minute);
			}
			else{
				System.out.printf("%dm%ds",minute,second);
			}
		}
   }
}