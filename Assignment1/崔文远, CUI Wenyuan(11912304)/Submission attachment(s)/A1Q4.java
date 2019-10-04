public class A1Q4 {
    public static void main(String[]args){
        int times,sum,max,b;
        times=0;
        sum=0;
        max=0;
        times=args.length;
        int counter=0;
        while (counter<times){
        b=Integer.parseInt(args[counter]);
        counter++;
        sum+=counter;
        if (max<=b){
            max=b;
        }}
        if ((times>=10&&sum>=5000)||max>=8000){
            System.out.println("Diamod");
        }else if ((times>=5&&sum>=2000)||max>=3000){
            System.out.println("Gold");
        }else if ((times>=2&&sum>=800)||max>=1000){
            System.out.println("Silver");
        }
    }
}
