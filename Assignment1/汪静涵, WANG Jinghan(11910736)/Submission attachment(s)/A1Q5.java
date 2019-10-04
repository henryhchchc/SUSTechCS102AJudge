

public class A1Q5 {
    public static void main(String[]args){
        int i=0;
        while (i<args.length)
        {
            double a=Double.parseDouble(args[i]);        //price
            int b=(int)a%10;                    //pick the unit place
            i++;
            if(b==4)                            //if b=4, change it to 9
                a+=5;
            else
            {
                if(b==2)                        //if b=2, change it to 6
                    a+=4;
                else
                {continue;}
            }
            System.out.printf("%.1f ",a);       //output the correct price
        }//end while

    }//end main
}
