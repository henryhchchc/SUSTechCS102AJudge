public class A1Q4 {

    public static void main(String[] args) {
        int i = 0, sum = 0, max = 0;
        int len = args.length;
        while (i < len) {
            String a = args[i];
            Integer fee = new Integer(a);
            sum = sum + fee;
            i++;
            if (max < fee) max = fee;
        }if (i >= 10 && sum >= 5000 || max >= 8000)
            System.out.println("Diamond");
        else if (i >= 5 && sum >= 2000 || max >= 3000)
                System.out.println("Gold");
        else if (i >= 2 && sum >= 800 || max >= 1000)
                System.out.println("Silver");
    }
}

