
public class A1Q4 {
    public static void main(String[] args) {
        double m1 = Double.parseDouble(args[0]);
        double m2;
        int k = args.length;
        double sum = 0;


        for (int i = 1; i < k; i++){
            double m3 = Double.parseDouble(args[i]);
            if (m1 >= m3) ;
            else m1 = m3;
        }
        if (m1 >= 8000)
            System.out.print("Diamond");
        else if (m1 >=3000)
            System.out.print("Gold");
        else if (m1 >= 1000)
            System.out.print("Silver");
        else if (k >= 10) {
            for (int i = 0; i < k; i++) {
                m2 = Double.parseDouble(args[i]);
                sum += m2;
            }if (sum >= 5000)
                System.out.print("Diamond");
            else if (sum >= 2000)
                System.out.print("Gold");
            else if (sum >= 800)
                System.out.print("Silver");
            else System.out.print("Iron");

        }else if (k >= 5){
            for (int i =0; i < k;i++){
                m2 = Double.parseDouble(args[i]);
                sum += m2;
            }if (sum >= 2000)
                System.out.print("Gold");
            else if (sum >= 800)
                System.out.print("Silver");
            else System.out.print("Iron");
        }else if (k >=2 ){
            for (int i = 0; i<k; i++){
                m2 = Double.parseDouble(args[i]);
                sum += m2;
        } if (sum >=800)
            System.out.print("Silver");
            else System.out.print("Iron");

    }else System.out.print("Iron");
}
}
