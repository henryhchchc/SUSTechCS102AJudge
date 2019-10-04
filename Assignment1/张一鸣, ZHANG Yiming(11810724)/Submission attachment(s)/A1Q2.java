import java.util.Scanner;

public class A1Q2{
    public static void main(String[] args){

        Scanner time = new Scanner(System.in);
        int starthour;
        int startmin;
        int startsec;
        int endhour;
        int endmin;
        int endsec;

        starthour = time.nextInt();
        startmin = time.nextInt();
        startsec = time.nextInt();

        endhour = time.nextInt();
        endmin = time.nextInt();
        endsec = time.nextInt();

        int hour,min,sec,minout;

        hour = endhour - starthour;
        min = endmin - startmin;
        sec = endsec - startsec;

        if (sec<0){
            min = min - 1;
            sec = 60+sec;}
        else;

        if (min<0){
            hour = hour - 1;
            min = 60+min;}
        else;

        minout = min+hour*60;

        if (sec == 0){
          if (minout == 0){
              System.out.print("0s");}
          else System.out.printf("%dm",minout);}
        else if (minout == 0){
             System.out.printf("%ds",sec);}
        else System.out.printf("%dm%ds",minout,sec);
    }
}


