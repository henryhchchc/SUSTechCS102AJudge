public class A1Q4 {
    public static void main(String[] args) {
        int n = 0, i1 = 0, a = 0, b = 0, c = 0;
        int j = args.length;
        while (n < j) {
            int i = Integer.parseInt(args[n]);
            n++;
            i1 += i;
            if (i >= 8000 | (i1 >= 5000 & n >= 10)) {
                a++;
            } else if (i >= 3000 | (i1 >= 2000 & n >= 5)) {
                b++;
            } else if (i >= 1000 | (i1 >= 800 & n >= 2)) {
                c++;
            }
            }if (a>0) {
            System.out.println("Diamond");
        }else if(b>0){
            System.out.println("Gold");
        }else if (c>0){
            System.out.println("Silver");
        }
    }
}