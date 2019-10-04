import java.util.Scanner;

public class A1Q5 {

    public static void main(String[] args) {
	//AUTO revise
        {
            for(String arg:args)
            {

                char c =arg.charAt(arg.length()-3);
                double num = Double .parseDouble(arg);
                int d=(int)(c)-(int)('0');
                if(d==2)
                    System.out.print(num+4+" ");
                if(d==4)
                    System.out.print(num+5+" ");

            }

        }

    }



}

