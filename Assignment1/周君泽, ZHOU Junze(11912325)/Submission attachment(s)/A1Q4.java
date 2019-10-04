//import java.util.Scanner;

public class A1Q4 {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
        int time = 0,sum = 0,temp,m = 0,t = args.length,index = 0;
        String grade = "";
        while(index<t){
            temp = Integer.parseInt(args[index]);
            m = java.lang.Math.max(temp,m);
            time++;
            sum += temp;
            index++;
        }
        if ((time>=10 && sum>=5000) || m>=8000) grade = "Diamond";
        else if ((time>=5 && sum>=2000) || m>=3000) grade = "Gold";
        else if ((time >=2 && sum>=800) || m>=1000) grade = "Silver";
        System.out.printf("%s",grade);
    }
}
