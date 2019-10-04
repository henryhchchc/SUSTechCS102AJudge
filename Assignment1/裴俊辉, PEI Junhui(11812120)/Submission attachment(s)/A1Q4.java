import java.util.Scanner;

public class A1Q4 {
    public static void main(String[] args) {
        int number=0;
        int cumulative=0;
        int single;
        int max=0;
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            single=input.nextInt();
            cumulative=single+cumulative;
            number=++number;
            if (max<single){
                max=single;
            }
        }
        if (number>=10&&cumulative>=5000||max>=8000){
            System.out.print("Diamond");
        }
        else if (number>=5&&cumulative>=2000||max>=3000){
            System.out.print("Gold");
        }
        else if (number>=2&&cumulative>=800||max>=1000){
            System.out.print("Sliver");
        }
    }
}
