import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] c = new int[6];
        int n = 0;

        while(n<6){

            c[n] =input.nextInt();
            n++;
        }

        int hr1,hr2,mi1,mi2,sc1,sc2;
        hr1 = c[0];
        hr2 = c[3];
        mi1 = c[1];
        mi2 = c[4];
        sc1 = c[2];
        sc2 = c[5];


        int seconds,min,sec;
        seconds=(hr2-hr1)*3600 + (mi2-mi1)*60 + (sc2-sc1);
        min = seconds/60;
        sec = seconds-(min*60);
        if(min == 0 && sec == 0) {
            System.out.print("0s");
        }
        else
            if (min == 0 && sec != 0){
                System.out.printf("%ss",sec);
            }
            else
                if (min != 0 && sec == 0){
                    System.out.printf("%sm",min);
                }
                else {
                    System.out.printf("%sm%ss", min, sec);
                }
    }

}
