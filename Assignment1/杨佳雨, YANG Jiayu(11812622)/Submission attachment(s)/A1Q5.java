public class A1Q5 {
    public static void main(String[] args){
        int length = args.length;
        int a = 0;
        while(length > 0){
            float N = Float.parseFloat(args[a]);
            int number =(int)N % 10;
            if(number == 2){
                N = N + 4;
                System.out.printf("%.1f ",N);
            }
            else if(number == 4){
                N = N + 5;
                System.out.printf("%.1f ",N);
            }
            length--;
            a++;
        }

    }

}