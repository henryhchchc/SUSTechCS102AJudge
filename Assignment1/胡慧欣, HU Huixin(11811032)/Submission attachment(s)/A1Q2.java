import java.util.Scanner;
public class A1Q2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        int hour1=input.nextInt();
        int minute1=input.nextInt();
        int second1=input.nextInt();
        int hour2=input.nextInt();
        int minute2=input.nextInt();
        int second2=input.nextInt();


        int Total = (hour2 - hour1) * 3600 + (minute2 - minute1) * 60 + (second2 - second1);
        int m =Math.floorDiv(Total,60);
        int s = Total % 60;
        if(m==0){
            System.out.println(s+"s");}
        else if(s==0){
            System.out.println(m+"m");
        }
        else{
                System.out.println(m + "m" + s + "s");
            }
        }

    }

