public class A1Q5 {
    public static void main(String[] args){
        int a=1,b;
        while(a<=args.length){
            double i =Double.parseDouble(args[a-1]);
            b =(int)i;
            int c=b%10;
            if (c==2){
                i += 4;
                System.out.printf("%.1f ",i);
            }else  if(c == 4){
                i +=5;
                System.out.printf("%.1f ",i);
            }
            a++;

        }

    }
}
