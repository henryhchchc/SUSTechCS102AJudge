public class A1Q5 {
    public static void main(String[] args) {
        int length = args.length;
        int a,b;
        a=0;
        double n;
        while(a<length){
            n = Double.parseDouble(args[a]);
            String str = Double.toString(n);
        b=(int)n;
        a++;
        if(b%10 == 2){
            System.out.print(str.replace("2","6")+" ");
        }
        else if(b%10 == 4){
            System.out.print(str.replace("4","9")+" ");
        }

    }
    }
}
