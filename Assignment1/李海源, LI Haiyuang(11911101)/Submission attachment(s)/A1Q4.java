import java.util.Scanner;

public class A1Q4 {
    public static void main(String[] args) {
        int su = 0;
        int tim = args.length;int i=0;int max = 0;
        int consumption;
        while (i<args.length){
            consumption = Integer.parseInt(args[i]);
          su += consumption;
              if (max<=consumption)
                  max=consumption;
              i++;}
          if ((i >= 10 && su >= 5000) || max >= 8000)
                System.out.println("Diamond");
             else if ((i >= 5 && su >= 2000) || max >= 3000)
                 System.out.println("Gold");
             else if ((i >= 2 && su >= 800) || max >= 1000)
                System.out.println("Silver");
    }
}
