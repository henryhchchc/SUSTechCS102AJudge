public class A1Q5 {
    public static void main(String[] args){

        int length = args.length;
        int num,unit;
        int n = 0;
        double number;
        double [] c = new double[length];

        do {
            c[n] = Double.parseDouble(args[n]);
            n++;
        } while(n < length);

        for(int counter =0; counter < length; counter++){
            number = c[counter];
            num = (int) c[counter];
            unit = num%10;

            if(unit == 2){
               number += 4;
               System.out.printf("%s ",number);
            }
            else
               if(unit == 4){
                   number +=5;
                   System.out.printf("%s ",number);
               }
        }
    }
}