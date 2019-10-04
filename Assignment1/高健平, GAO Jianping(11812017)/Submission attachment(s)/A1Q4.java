
public class A1Q4 {
    public static void main(String[]args){
        int i= 0;double sum=0;double consume=0;double a=0;
        int length=args.length;
        while(i<length){
             consume=Double.parseDouble(args[i]);
             if(a<consume){
                 a=consume;
             }
            sum+=consume;
            i++;
        }
        if (i>=10&&sum>=5000||a>=8000)
                System.out.print("Diamond");
            else
            if(i>=5&&sum>=2000||a>=3000)
                System.out.print("Gold");
            else
            if(i>=2&&sum>=800||a>=1000)
                System.out.print("Silver");

}}


