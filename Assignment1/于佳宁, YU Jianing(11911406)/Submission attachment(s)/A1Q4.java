public class A1Q4 {
    public static void main(String[] args) {
        int i = 0;
        int c = 0;
        int m = 0;
        int length = args.length;
        while (i+1 < length) {
            int b = Integer.parseInt(args[i]);
            int g=Integer.parseInt(args[i+1]);
            if(b<g){
                b=g;}
            if(b>8000){m=3; }
            else if(b>5000){m=2;}
            else if(b>2000){m=1;}
            i++;
            c = c + b;
        }
        if (c > 5000 && i > 10 || m==3) {
            System.out.print("Diamond");
        } else if (c < 5000 && c > 2000 && i > 5 || m == 2) {
            System.out.print("Gold");
        } else if (c > 800 && c < 2000 && i > 2 || m == 1) {
            System.out.print("Silver");
        }
    }
}