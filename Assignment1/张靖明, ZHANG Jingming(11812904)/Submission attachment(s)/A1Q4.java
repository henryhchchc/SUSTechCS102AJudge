

public class A1Q4 {
    public static void main(String[] args) {
        int length = args.length;
        int i = 0;
        int sum = 0;
        int max = 0;
        while (i < length) {

            sum = sum + Integer.parseInt(args[i]);

            if (Integer.parseInt(args[i]) > max) {
                max = Integer.parseInt(args[i]);

            }i++;
        }
        if ((sum >= 5000 && length>10)||max>=8000){
                System.out.print("Diamond");}
                else if (((sum>=800&&sum<2000)&&(length<5||length>=2))||(max>=1000&&max<3000)){
                    System.out.print("Silver");}
                 else
                     System.out.print("Gold");


            }
        }





