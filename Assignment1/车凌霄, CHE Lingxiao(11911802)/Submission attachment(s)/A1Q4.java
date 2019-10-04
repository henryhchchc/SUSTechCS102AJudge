import java.util.Scanner;

public class A1Q4 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int level=0,time=0,money=0,sum=0;
        while(time<args.length){
            money=Integer.parseInt(args[time]);
            sum=sum+money;
            if (money>=8000) level=level>3?level:3;
            else if (money>=3000)level=level>2?level:2;
            else if(money>=1000)level=level>1?level:1;
            time++;
        }
        if (time>=10&&sum>=5000) level=3;
        else if(time>=5&&sum>=2000) level=level>2?level:2;
        else if(time>=2&&sum>=800) level=level>1?level:1;
        if (level==1) System.out.printf("Silver\n");
        else if(level==2) System.out.printf("Gold\n");
        else if(level==3) System.out.printf("Diamond\n");

    }
}