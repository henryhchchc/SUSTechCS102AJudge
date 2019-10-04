public class A1Q5 {
    public static void main(String[]args){
        int Length=args.length;
        int counter=0;
        while (counter<Length){

            double a=Double.parseDouble(args[counter]);
            int b=(int)a;
            if (b%10==2){
                a+=4;
                System.out.print(a+" ");
            }else if (b%10==4){
                a+=5;
                System.out.print(a+" ");
            }counter++;

            }

        }

    }

