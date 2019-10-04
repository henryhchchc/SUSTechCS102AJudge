public class A1Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            double price = in.nextDouble();
            double a = price*10;
            String b = String.valueOf(a);
            int i = b.length();
            if(b.charAt(i - 2) = 2||b.charAt(i - 2) = 4) {
                if(a>=100){
                    if (b.charAt(i - 2) = 2) {
                        a = b.charAt(i - 1) + 6 * 10 + b.charAt(i - 3) * 100;
                    } else if (b.charAt(i - 2) = 4) {
                        a = b.charAt(i - 1) + 9 * 10 + b.charAt(i - 3) * 100;
                    }
                }else{
                    if (b.charAt(i - 2) = 2) {
                        a = b.charAt(i - 1) + 6 * 10 ;
                    } else if (b.charAt(i - 2) = 4) {
                        a = b.charAt(i - 1) + 9 * 10;
                    }
                }

                price = a * 0.1;
                System.out.println(price);
            }
        }


    }
}
