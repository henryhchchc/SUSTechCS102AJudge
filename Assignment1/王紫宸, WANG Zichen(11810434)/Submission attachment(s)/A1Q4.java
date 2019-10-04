public class A1Q4 {
    public static void main(String[] args) {
        int total = 0;
        int Counter = 0;
        int a = 0;
        int b = 0;
        int length = args.length;

        while (a < length) {
            int price = Integer.parseInt(args[a]);
            total += price;
            Counter++;
            a++;
            if(price >= 8000&&b<3||b==3)
                b = 3;
            else if(price>=3000&&b<2||b==2)
                b = 2;
            else if(price>=1000&&b<1||b==1)
                b = 1;
            else
                b = 0;

        }

        if (Counter >= 10 && total >= 5000 || b>2)
            System.out.print("Diamond");
        else if (Counter >= 5 && total >= 2000 || b >1)
            System.out.print("Gold");
        else if (Counter >= 2 && total >= 800 || b >0)
            System.out.print("Silver");
        else
            System.out.print(" ");
    }

    }

