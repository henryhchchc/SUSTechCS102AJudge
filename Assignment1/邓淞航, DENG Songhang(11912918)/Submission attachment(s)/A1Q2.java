import java.util.Scanner;

public class A1Q2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String start,end;
        String[] kaishi,jiehshu;
        int hours,minutes,seconds;
        start=input.nextLine();
        end=input.nextLine();
        kaishi=start.split(" ");
        jiehshu=end.split(" ");
        hours=Integer.parseInt(jiehshu[0])-Integer.parseInt(kaishi[0]);
        minutes=Integer.parseInt(jiehshu[1])-Integer.parseInt(kaishi[1]);
        seconds=Integer.parseInt(jiehshu[2])-Integer.parseInt(kaishi[2]);
        if(seconds<0){
            seconds=60+seconds;
            minutes--;

        }
        minutes=hours*60+minutes;
        if(minutes==0&&seconds==0){
            System.out.println("0s");
            return;
        }
        if(seconds==0){
            System.out.printf("%dm",minutes);
            return;
        }
        System.out.printf("%dm%ds",minutes,seconds);
	// write your code here
    }
}
