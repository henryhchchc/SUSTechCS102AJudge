public class A1Q4 {
    public static void main(String[] args) {
        int sum=0;
        int a = 0;
        int count=0;
        int max=0;
        for( int i = 0;i<args.length;i++){
            a = Integer.parseInt(args[i]);
            if (a>max)
                max=a;
            sum = sum + a;
            count++;
        }
        if((count >= 10 && sum >= 5000) || max >= 8000){
            System.out.print("Diamond");
        }else if((count >= 5 && sum >= 2000) || max >= 3000){
            System.out.print("Gold");
        }else if((count >= 2 && sum >= 800) || max >= 1000){
            System.out.print("Silver");
        }






    }
}
