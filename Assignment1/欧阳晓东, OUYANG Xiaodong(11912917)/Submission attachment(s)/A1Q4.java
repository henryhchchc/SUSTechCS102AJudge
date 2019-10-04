public class A1Q4 {
    public static void main(String[] args) {
        int length = args.length;
        int a=0,b=0,c=0,x=0,sum=0;
        while (x<length){
            int cost = Integer.parseInt(args[x]);
            if(cost>=8000){
                a=1;
                }
            else if(cost>=2000){
                b=1;
            }
            else if(cost>=1000){
                c=1;
            }
        sum = sum + cost;
        x=x+1;
        }
        if((length>=10 && sum>=5000) || a==1) {
            System.out.println("Diamond");
        }
        else if ((length>=5 && sum>=2000) || b==1){
            System.out.println("Gold");
        }
        else if((length>=2 && sum>=800) || c==1){
            System.out.println("Silver");
        }
    }
}