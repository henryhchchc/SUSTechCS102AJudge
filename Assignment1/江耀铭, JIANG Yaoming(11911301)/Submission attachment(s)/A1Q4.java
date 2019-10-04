import com.sun.source.tree.WhileLoopTree;

import javax.swing.*;

public class A1Q4 {
    public static void main(String[] args) {
int length=args.length;
        int sum=0;
        for (String arg : args) {
            sum = sum + Integer.parseInt(arg);
        }
        if (sum>=8000||sum>=5000&length>=10)
            System.out.println("Diamond");
        else if (sum>=3000||sum>=2000&length>=5)
            System.out.println("Gold");
        else if (sum>=1000||sum>=800&length>=2)
            System.out.println("Silver");
    }
}
