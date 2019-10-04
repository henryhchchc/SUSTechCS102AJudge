public class A1Q5 {
    public static void main(String[] args) {
        int i=0;
        while (true) {
            int length=args.length;
            if(i==length) {
                break;}
            double number = Double.parseDouble(args[i]);
            int shi;
            shi = (int) (number / 10);
            int ge;
            ge = (int)(number-10*shi);
            i+=1;
            if (ge ==2){
                System.out.print(number+4);
                System.out.print(" ");
            }
            else if(ge==4){
                System.out.print(number+5);
                System.out.print(" ");
            }
        }
    }
}
