import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        int seconds1, seconds2, seconds;
        int hours1, hours2, hours;
        int minutes1, minutes2, minutes;
        Scanner input = new Scanner(System.in);
        hours1 = input.nextInt();
        minutes1 = input.nextInt();
        seconds1 = input.nextInt();
        hours2 = input.nextInt();
        minutes2 = input.nextInt();
        seconds2 = input.nextInt();
        hours= hours2 - hours1;
        minutes = minutes2 - minutes1;
        seconds = seconds2 - seconds1;
        seconds = hours * 3600 + minutes * 60 + seconds;
        minutes = seconds / 60;
        seconds = seconds - minutes * 60;
        if (minutes1 == minutes2 && hours == 0){
            System.out.print(seconds + "s");}
        else if (seconds1 == seconds2){
            System.out.println(minutes + "m");}
        else
            System.out.print(minutes + "m" + seconds + "s"); }
        }