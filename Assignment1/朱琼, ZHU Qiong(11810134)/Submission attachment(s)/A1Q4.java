import java.util.Arrays;
import java.util.Collections;
public class A1Q4 {
    public static void main(String[] args){
        int amount1=Integer.parseInt(args[0]);
        int amount2=Integer.parseInt(args[1]);
        int amount3=Integer.parseInt(args[2]);
        int amount4=Integer.parseInt(args[2]);
        int consumptions=amount1+amount2+amount3+amount4;
        int number=args.length;
        Integer[] amounts = {amount1,amount2,amount3,amount4};
        int max=(int) Collections.max(Arrays.asList(amounts));
        if(((number>=10)&(consumptions>=5000))|(max>=8000))
            System.out.print("Diamond");
        else if(((5<=number)&(consumptions>=2000))|(max>=3000))
            System.out.print("Gold");
        else if (((2<=number)&(consumptions>=800))|(max>=1000))
            System.out.print("Silver");
    }
}
