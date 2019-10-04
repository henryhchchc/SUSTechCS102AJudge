public class A1Q4 {
    public static void main(String[] args) {
        double a;double b=0;double sum = 0;int i = args.length;
        for(int e=0;e<i;e++){
            a = Double.parseDouble(args[e]); sum = a + sum;
            if(a>b) b = a;
        }
        if ( i >= 2 && sum >= 800&&sum<2000) {
            System.out.print("Silver");
        } else {
            if (b >= 1000&& b<5000 ) {
                System.out.print("Silver"); }
            else {
                if (b >= 1000 && i >= 2 && sum >= 800&&sum<2000) {
                    System.out.print("Silver"); }
            }
        }
        if(i>=5&&sum>=2000&&sum<5000){
            System.out.print("Gold");
        } else {
            if (b>=3000&&b<8000) {
                System.out.print("Gold"); }
            else {
                if (b>=3000&&i>=5&&sum>=2000&&sum<5000) {
                    System.out.print("Gold"); }
            }
        }
        if(i>=10&&sum>=5000){
            System.out.print("Diamond");
        } else {
            if (b>=8000) {
                System.out.print("Diamond"); }
            else {
                if (b>=8000&&i>=10&&sum>=5000) {
                    System.out.print("Diamond"); }
            }
        }
    }
}
