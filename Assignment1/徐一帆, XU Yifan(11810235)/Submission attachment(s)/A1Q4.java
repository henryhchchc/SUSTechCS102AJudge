import java.util.Arrays;
public class A1Q4 {
    public static void main(String []args){
        int sum=0;
        int[]num=new int [args.length];
        Arrays.sort(args);
        int i=0;
        while(i<args.length){
            num[i] = Integer.parseInt(args[i]);
            sum += num[i];
            i++;
            continue;
        }

        if( (i>9&&sum>=5000)||num[args.length-1] >=8000) {
            System.out.println("Diamond");

        } else if((i>4&&sum>=2000)||num[args.length-1] >=3000){
            System.out.println("Gold");

        }else if((i>1&&sum>=800)||num[args.length-1]>=1000){
            System.out.println("Silver");
        }



    }
}
