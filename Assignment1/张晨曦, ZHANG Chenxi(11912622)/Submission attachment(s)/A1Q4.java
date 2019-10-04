import java.util.Scanner;
public class A1Q4{
    public static void main(String []args)
    {  Scanner input=new Scanner(System.in);
    int length =args.length;
    int[] shu=new int[length];
        for(int i=0;i<length;i++){
            shu[i] = Integer.parseInt(args[i]);
        }
    int sum=0;
        for(int i=0;i<length;i++)
    sum+=shu[i];
        for(int i=0;i<length;i++) {
                if ((sum >= 5000&&length>=10)||shu[i]>=8000) {
                    System.out.print("Diamond");
                    break;
                }
                else if ((sum >= 2000&&length>=5)||shu[i]>=3000) {
                        System.out.print("Gold");
                        break;
                    }
                else if ((sum >= 800&&length>=2)||shu[i]>=1000) {
                        System.out.print("Silver");
                        break;
                    }
            }
        }}