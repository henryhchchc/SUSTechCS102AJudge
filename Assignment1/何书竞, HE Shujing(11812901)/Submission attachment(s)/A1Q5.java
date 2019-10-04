public class A1Q5 {
    public static void main(String [] args){
        int i = args.length;
        int counter = 0;

        while(counter<i) {
            float number = Float.parseFloat(args[counter]);
            int a = (int) number;
            String num = "" + a;
            boolean b1 = num.endsWith("2");
            boolean b2 = num.endsWith("4");
            if (b1) {
                number += 4;
                System.out.printf(" "+number);
            } else if (b2) {
                number += 5;
                System.out.printf(" "+number);
            }
            counter++;

        }

    }
}
