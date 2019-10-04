public class A1Q4 {
    public static void main(String[] args) {
        double total=0;
        int i,max=0;
        double amount;
        for (i = 0; i< args.length; i++) {
            amount = Integer.parseInt(args[i]);
            max = Integer.parseInt(args[0]);
            total += amount;
            if (amount > max)
                max = (int) amount;
        }int length=args.length;
        if ((max >= 8000) || ((length >= 10) && (total >= 5000)))
                System.out.println("Diamond");
        else if ((max >= 3000) ||((length >= 5) && (total >= 2000)))
                System.out.println("Gold");
        else if ((max >= 1000) && ((length >=2) || (!(total >= 800))))
                System.out.println("Silver");
        }}
