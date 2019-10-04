

public class A1Q4 {
    public static void main(String[] args) {
        int length = args.length;
        int i = 0;
        float money = 0;
        float maxmoney = Float.parseFloat(args[0]);
        for (; i <= length - 1; i++) {
            money = money + Float.parseFloat(args[i]);
            if (maxmoney >= Float.parseFloat(args[i]))
                maxmoney = maxmoney;
            else
                maxmoney = Float.parseFloat(args[i]);
        }
        if (money >= 5000 && length >= 10 || maxmoney >= 8000)
            System.out.print("Diamond");
        else if (money >= 2000 && length >= 5 || maxmoney >= 3000)
            System.out.print("Gold");
        else if (money >= 800 && length >= 2 || maxmoney >= 1000)
            System.out.print("Silver");
    }
}
