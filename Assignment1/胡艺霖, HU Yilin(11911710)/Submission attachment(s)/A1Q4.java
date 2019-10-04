public class A1Q4 {
    public static void main(String[] args) {

        int b, c, i;
        i = 0;
        c = 0;
        b = args.length;
        int[] a = new int[10];
         a[i] = Integer.parseInt(args[i]);
        while (i < b) {
            c = a[i] + c;
            i = i + 1;
        }
        if(c>=8000||(b>=10 && c>=5000))
            System.out.print("Diamond");
        else if(c>=3000||(b>=5 && c>=2000))
            System.out.print("Gold");
        else if (c>=1000||(b>=2 && c>=800))
            System.out.print("Silver");

    }
}
