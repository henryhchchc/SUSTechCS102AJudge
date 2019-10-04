
public class A1Q5 {
    public static void main(String[] args) {
        int l = args.length;
        for (int i = 0; i < l; i++) {
            if (args[i].contains(".")) {
                if (args[i].contains("2.")) {
                    double c = Double.parseDouble(args[i]);
                    c = c + 4;
                    System.out.print(c);
                    System.out.print(" ");
                }
                if (args[i].contains("4.")) {
                    double c = Double.parseDouble(args[i]);
                    c = c + 5;
                    System.out.print(c);
                    System.out.print(" ");
                }

            }
            /*Scanner input = new Scanner(System.in);
            double price;
            double number;
            double sum = 0 ;
            double result;
            while(input.hasNext()){
                price = input.nextDouble();
                number =input.nextDouble();
                result = price * (int)number;
                sum += result;
                if(number - (int)number == 0.5){
                    result = price / 2 + 1;
                    sum += result;
                }
            };
            System.out.printf("%.1f",sum);*/
        }
    }
}
