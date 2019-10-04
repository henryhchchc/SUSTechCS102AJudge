import java.util.Scanner;
public class A1Q2 {

    public static void main(String[] args)
    {int ss1,mm1,hh1,ss2,mm2,hh2,waitingMinutes,waitingSeconds,i,j;
        Scanner input = new Scanner(System.in);
        hh1=input.nextInt();
        mm1=input.nextInt();
        ss1=input.nextInt();
        hh2=input.nextInt();
        mm2=input.nextInt();
        ss2=input.nextInt();
        i=0;j=1;
        waitingMinutes=(hh2-hh1)*60+(mm2-mm1);
        waitingSeconds=ss2-ss1;
        if(waitingMinutes>=j&&waitingSeconds<i)
        {waitingMinutes=waitingMinutes-1;
            waitingSeconds=60+waitingSeconds;}



        if(waitingSeconds>i&&waitingMinutes>i)
            System.out.println(waitingMinutes+"m"+waitingSeconds+"s");
        else if(waitingSeconds>=i&&waitingMinutes==i)
            System.out.println(waitingSeconds+"s");
        else if(waitingSeconds==i&&waitingMinutes>i)
            System.out.println(waitingMinutes+"m");
        else if(waitingSeconds == i&&waitingMinutes == i)
            System.out.println(waitingSeconds+"s");


    }

}
