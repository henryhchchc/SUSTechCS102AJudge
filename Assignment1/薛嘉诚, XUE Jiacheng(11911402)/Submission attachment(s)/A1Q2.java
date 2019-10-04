import java.util.Scanner;
public class A1Q2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hh1,mm1,ss1;
        int hh2,mm2,ss2;
        int min,sec,ok;
        hh1 = scan.nextInt();
        mm1 = scan.nextInt();
        ss1 = scan.nextInt();
        System.out.println();
        hh2 = scan.nextInt();
        mm2 = scan.nextInt();
        ss2 = scan.nextInt();
        ok = hh2 *60*60 + mm2 *60 + ss2 - hh1 *60*60 - mm1 *60 - ss1;
        min = ok /60;
        sec = ok - min *60;


            if (sec==0 && min !=0)
                System.out.printf("%dm",min);

            if (sec==0 && min==0)
                System.out.print("0s");
            if (sec!=0 && min==0)
                System.out.printf("%ds",sec);

        if (sec !=0 && min!=0)
            System.out.printf("%dm%ds",min,sec);





    }
}
