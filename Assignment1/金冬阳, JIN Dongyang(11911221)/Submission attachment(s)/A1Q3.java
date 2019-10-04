
    import java.util.Scanner;
    public class A1Q3 {
        public  static  void main(String[] args){
            double price;
            double money=0;
            double n;
            double number;
            Scanner in = new Scanner(System.in);
            while(in.hasNext()) {
                price = in.nextDouble();
                number = in.nextDouble();
                if (number * 2 % 2 == 1) {
                    n = price * 0.5 + 1;
                    if (n * 100 % 10 >= 5) {
                        n = n - n * 100 % 10 / 100 + 0.1;
                    }
                    else n = n - n * 100 % 10 / 100;
                    money = money + n + (number - 0.5) * price;
                }
                else
                    money = money + price * number;
            }
            System.out.printf("%s ",money);

        }
    }

