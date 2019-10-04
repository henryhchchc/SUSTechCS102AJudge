
public class A1Q4 {
    public static void main(String[]args){
            int length=args.length;
            int money[]=new int[length];
        for(int i=0;i<length;i++) {
            money[i] = Integer.parseInt(args[i]);
            int sum = 0;
            sum += money[i];
            if (length >= 10 && sum >= 5000 || sum >= 8000)
                System.out.printf("Diamond");
            else if (length >= 5 && sum >= 2000 || sum >= 3000)
                System.out.printf("Gold");
            else if (length >= 2 && sum >= 800 || sum >= 1000)
                System.out.printf("Silver"); }
    }
}
