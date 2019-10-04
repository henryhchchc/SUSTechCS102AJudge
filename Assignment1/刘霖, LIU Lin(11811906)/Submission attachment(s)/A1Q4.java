public class A1Q4 {
    public static void main (String[] args) {
        int length = args.length;
        int sum = 0;
        int max = 0;
        int summax = 0;
        for (int i = 0 ; i < args.length; i++){
          int age = Integer.parseInt(args[i]);
          sum = sum + age;
          if (sum >= summax)
              summax = sum;
          if (age >= max)
              max = age;
        }
        if (max >= 8000 | (summax >= 5000 && length >= 10))
            System.out.println("Diamond");
        else if (max >= 3000 | (summax >= 2000 && length >= 5))
            System.out.println("Gold");
        else if (max >= 1000 | (summax >= 800 && length >= 2))
            System.out.println("Silver");
    }

}