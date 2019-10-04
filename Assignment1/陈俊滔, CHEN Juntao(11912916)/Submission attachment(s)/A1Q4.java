public class A1Q4 {
    public static void main(String[] args) {
        Long number = Long.parseLong(args[0]);
        int i;
        Long sum = 0L ;
        int time = args.length;
        for(i=0;i<time;i++){
            sum = sum + number;
        }
        if (number >= 8000 | time >= 10 & sum >= 5000) {
            System.out.println("Diamond");
        } else if (number >= 3000 | time >= 5 & sum >= 2000) {
            System.out.println("Gold");
        } else if (number >= 1000 | time >= 2 & sum >= 800) {
            System.out.println("Silver");
        }
    }
}
