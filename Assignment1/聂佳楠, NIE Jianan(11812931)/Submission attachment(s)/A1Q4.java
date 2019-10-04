import java.util.Scanner;
public class A1Q4 { public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int n=args.length;int i,a,b,sum;i=0;sum=0;b=0;
    while(i<=(n-1)){
        a=Integer.parseInt(args[i]);
        sum+=a;i++;
        if(a>b)
            b=a; }

    if((i>=10&&sum>=5000)||b>=8000)
        System.out.println("Diamond");
    else if((i>=5&&sum>=2000)||b>=3000)
        System.out.println("Gold");
    else if ((i>=2&&sum>=800)||b>=1000)
        System.out.println("Silver");
    else
        System.out.println("Not vip.");


}
}
