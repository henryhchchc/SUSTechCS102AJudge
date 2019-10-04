import java.util.*;
public class A1Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int time[] = new int[6];
        for (int i = 0; i < 6 ; i++) {
            time[i]=sc.nextInt();
        }
        int total_second = time[5]-time[2]+60*(time[4]-time[1])+3600*(time[3]-time[0]);
        int total_min = total_second/60;
        int rest_sec = total_second%60;
        if(total_min==0&&rest_sec==0)
            System.out.println("0s");
        else if(total_min==0&&rest_sec!=0)
            System.out.println(rest_sec+"s");
        else if(total_min!=0&&rest_sec==0)
            System.out.println(total_min+"m");
        else
            System.out.println(total_min+"m"+rest_sec+"s");
    }
}
