import java.util.Scanner;

public class A1Q4 {
    public static void main (String[] args){

        int length=args.length;
        int total=0, highest=0;
        for (int i = 0; i < length; i ++){
            total += Integer.parseInt(args[i]);
            if (Integer.parseInt(args[i])>highest){
                highest=Integer.parseInt(args[i]);
            }

        }
        if (length>=10&&total>=5000||highest>=8000)
            System.out.printf("Diamond");
        else if (length>=5&&total>=2000||highest>=3000)
            System.out.printf("Gold");
        else if (length>=2&&total>=800||highest>=1000)
            System.out.printf("Silver");



    }

}
