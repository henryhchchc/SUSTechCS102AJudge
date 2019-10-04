public class A1Q4{

    public static void main(String  [] args) {
        int length = args.length;
        int sum = 0;
        int i = 0;

        while (i < length) {
            sum = sum + Integer.parseInt(args[i]);
            i++;
        }

        int max = Integer.parseInt(args[0]);
        for(int j = 0; j < length; j++) {
            if (max < Integer.parseInt(args[j]))
                max = Integer.parseInt(args[j]);
        }

        if((length >= 10 && sum >= 5000) || max >= 8000)
            System.out.println("Diamond");
        else if((length >= 5 && sum >= 2000) || max >= 3000)
            System.out.println("Gold");
        else if((length >= 2 && sum >= 800) || max >= 1000)
            System.out.println("Silver");
    }
}

