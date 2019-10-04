public class A1Q4 {
    public static void main (String[] args){
        int length = args.length;
        int sum = 0;
        int max = 0;
        for(int i = 0; i < length; i++ ) {
            String cost = args[i];
            int single = Integer.parseInt(cost);
            sum = sum + single;
            if (max < single) {
                max = single;
            }
        }
        if (length >= 10 && sum >= 5000 || max >= 8000) {
            System.out.printf("Diamond\n");
        }
        else if (length >= 5 && sum >= 2000 || max >= 3000) {
            System.out.printf("Gold\n");
        }
        else if (length >= 2 && sum >= 800 || max >= 1000) {
            System.out.printf("Silver\n");

        }
    }
}
