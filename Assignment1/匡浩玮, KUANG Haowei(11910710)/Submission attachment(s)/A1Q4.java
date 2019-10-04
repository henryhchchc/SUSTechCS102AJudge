public class A1Q4 {
    public static void main(String[] args) {
        String ans;
        ans="aa";
        int m = 0;
        int max = 0;
        int sum = 0;
        int length = args.length;
        int i=0;
        while (i<=length-1) {
            int price = Integer.parseInt(args[i]);
            ++i;
            m = m + 1;
            sum = sum + price;
            if (price > max) max = price;
        }
        if (m >= 2) if (sum >= 800) ans = "Silver";
        if (max >= 1000) ans = "Silver";
        if (m >= 5) if (sum >= 2000) ans = "Gold";
        if (max >= 3000) ans = "Gold";
        if (m >= 10) if (sum >= 5000) ans = "Diamond";
        if (max >= 8000) ans = "Diamond";
        if(ans!="aa") System.out.println(ans);
    }
}
