import java.util.Scanner;

public class A1Q2  {
    public static void main(String[] args){
        int Shours;
        int Sminutes;
        int Sseconds;

        int Ehours;
        int Eminutes;
        int Eseconds;

        Scanner input = new Scanner(System.in);

        Shours = input.nextInt();
        Sminutes = input.nextInt();
        Sseconds = input.nextInt();

        Ehours = input.nextInt();
        Eminutes = input.nextInt();
        Eseconds = input.nextInt();

        int hours = Ehours-Shours;
        int minutes = hours*60+(Eminutes-Sminutes);
        int seconds = Eseconds-Sseconds;

        if (minutes==0)
            System.out.printf("%ss",seconds);
        else if (seconds==0)
            System.out.printf("%sm",minutes);

        if (seconds >0)
            System.out.printf("%sm%ss",minutes,seconds);
        else if (seconds<0){
            minutes = minutes-1;
            seconds = seconds+60;
            System.out.printf("%sm%ss",minutes,seconds); }





    }
}
