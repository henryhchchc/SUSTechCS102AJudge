import java.util.*;
public class A1Q4 {
    public static void main(String args[]){
        int total_pts = 0;
        int times = 0;
        for (int i = 0; i < args.length; i++) {
            total_pts = total_pts + Integer.parseInt(args[i]);
            times++;
        }
        if((times>=10&&total_pts>=5000)||total_pts>=8000)
            System.out.println("Diamond");
        else if((times>=5&&total_pts>=2000)||total_pts>=3000)
            System.out.println("Gold");
        else if((times>=2&&total_pts>=800)||total_pts>=1000)
            System.out.println("Silver");
    }
}
