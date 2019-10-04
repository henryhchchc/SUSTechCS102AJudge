public class A1Q5 {
    public static void main(String[] args){
        for(int i=0;i<args.length;i++){
            double b = Double.parseDouble(args[i]);
            if(b%10 >= 2) {
                if (b % 10 < 3) {
                    b = b + 4;
                    System.out.print(b+" ");
                } else if (b % 10 >= 4)
                    if (b % 10 < 5) {
                        b = b + 5;
                        System.out.print(b+" ");
                    }
            }
        }

    }
}
