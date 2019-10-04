public class A1Q4 {

    public static void main(String[] args) {

        int i, l = args.length;

        float cost, big, sum;

        i = l;
        big = 0;
        sum = 0;

        while(i>0){

            cost = Float.parseFloat(args[i-1]);

            if(cost>big)
                big = cost;

            sum += cost;

            --i;
        }

        if(big>=8000||(l>=10&&sum>=5000))
            System.out.println("Diamond");
        else if(big>=3000||(l>=5&&sum>=2000))
            System.out.println("Gold");
        else if(big>=1000||(l>=2&&sum>=800))
            System.out.println("Silver");
        else
            return;
    }
}