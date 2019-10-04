public class A1Q4 {
    public static void main(String[] args) {
        int length = args.length;
        int Price = 0;
        int a = 0;
        int p = 0;
        int b = 0;
        while(length > 0) {
            int price1 = Integer.parseInt(args[a]);
            Price = Price + price1;
            length--;
            a++;
        }
        for(int length1 = args.length; length1 > 1;length1--){
            int price2 = Integer.parseInt(args[b]);
            int price3 = Integer.parseInt(args[b+1]);
            int p1 = Math.max(price2,price3);
            p = Math.max(p,p1);
        }
        int L = args.length;
        if(L >= 10 && (Price >= 5000 || p >= 8000)){
                System.out.println("Diamond");
            }

        else if(L >= 5 && (Price >= 2000 || p >= 3000)){
                System.out.println("Gold");
            }

        else if(L >= 2 && (Price >= 800 || p >= 1000)){
                System.out.println("Sliver");
            }
        }

    }