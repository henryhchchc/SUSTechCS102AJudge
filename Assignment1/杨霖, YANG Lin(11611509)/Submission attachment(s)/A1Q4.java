
public class A1Q4 {
    public static void main(String[] args) {
        int n = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        double total = 0;
        if (args.length>0){
            for (int i=0;i<args.length;i++){
            double price = Double.parseDouble(args[i]);
            n = n + 1;
            total += price;
            if (price >= 8000) a += 1;
            else if (price >= 3000) b += 1;
            else if (price >= 1000) c += 1;
        }}
        if ((n>=10)&(total>=5000))
            System.out.println("Diamond");
        else if ((n>=5)&(total>=2000)) {if (a>0) System.out.println("Diamond");else System.out.println("Gold"); }
        else if ((n>=2)&(total>=800)) {if (a>0) System.out.println("Diamond");else if (b>0){System.out.println("Gold");}else System.out.println("Silver");}
        else if (a>0) System.out.println("Diamond");else if (b>0){System.out.println("Gold");}else if (c>0)System.out.println("Silver");else System.out.println("No VIPs");}
    }