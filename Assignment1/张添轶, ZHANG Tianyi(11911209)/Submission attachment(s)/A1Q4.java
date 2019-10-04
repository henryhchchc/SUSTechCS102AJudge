public class A1Q4 {
    public static void main(String[] args){
        double s,sum=0.0,p=0.0;
        int i;
        String vip=" ";
        for (i=0; i < args.length ; i++)
        {
            s=Float.parseFloat(args[i]);
            if (s > p)  p = s;
            sum += s;
        }
        if(i>=10 && sum>=5000  ||  p>=8000)     vip="Diamond";
        else if(i>=5 && sum>=2000  ||  p>=3000) vip="Gold";
        else if(i>=2 && sum>=800  ||  p>=1000)  vip="Silver";
        System.out.printf("%s",vip);
    }
}