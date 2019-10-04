

    import java.util.Scanner;
    public class A1Q3 {
        public static void main(String [] args)	{
            Scanner in=new Scanner(System.in);

            double sum=0;
            while(in.hasNext()) {

                double a = in.nextDouble();
               double b = in.nextDouble();
               if(b%1==0) {
                sum = sum+a*b;}
               else{
                 sum = sum+a*b+1;}
                 sum = Math.floor(sum*10+0.5)/10;
            }
            System.out.print(sum);

        }
    }



