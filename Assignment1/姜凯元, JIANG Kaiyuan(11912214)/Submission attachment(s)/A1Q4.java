public class A1Q4 {
    public static void main(String[] args) {

        int i = 0;
        int counter = args.length;
        int max = 0;
        int n = 0;
        for (int j = 0; j < args.length; j++) {
            if (max <= Integer.parseInt(args[j]))
                max = Integer.parseInt(args[j]);
        }
        int sum = 0;
        for(int m=0; m < args.length;m++) {
            int price = Integer.parseInt(args[m]);
            sum += price;
        }
        if (sum >= 5000 && counter >= 10 || max >= 8000)
            System.out.println("Diamond");
        else if(sum >= 2000 && counter >= 5 || max >= 3000)
            System.out.println("Gold");
        else if(sum >= 800 && counter >= 2 || max >= 1000)
            System.out.println("Silver");


    }


}
