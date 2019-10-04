import java.util.Scanner;


public class A1Q2 {
    public static void main(String[] args){
        int hh1,mm1,ss1,hh2,mm2,ss2,m,s,t;

        Scanner input = new Scanner(System.in);
        hh1 = input.nextInt();
        mm1 = input.nextInt();
        ss1 = input.nextInt();

        hh2 = input.nextInt();
        mm2 = input.nextInt();
        ss2 = input.nextInt();


        t = ((hh2 - hh1) * 3600) + ((mm2 - mm1) * 60) + (ss2 - ss1);
        m = t / 60;
        s = t % 60;


        if (m != 0 && s != 0) {
                System.out.println(m + "m" + s + "s");
        }else if(m == 0 && s != 0){
                System.out.println(s + "s");
        }else if(m != 0 && s == 0){
                System.out.println(m + "m");
        }else{
                System.out.println("0s");
        }







        
    }
}
