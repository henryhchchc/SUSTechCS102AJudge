public class A1Q5 {
    public static void main(String[] args){
        String e;double a; int sign,i;
        int length = args.length;
        for (int j = 0; j < length; j++){
            a = Double.valueOf(args[j]);
            sign = -1;
            i = (int)Math.floor(a);
            i %=10;
            if (i == 2) { a = a - i + 6;System.out.print(a+" "); }
            if (i == 4) { a = a - i + 9;System.out.print(a+" "); }
        }
    }
}