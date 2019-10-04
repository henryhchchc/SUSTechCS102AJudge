import java.util.Scanner;

public class A1Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pre[]=new int[4];
        int later[]=new int[4];
        for(int i=1;i<=3;i++) pre[i]=input.nextInt();
        for(int i=1;i<=3;i++) later[i]=input.nextInt();
        pre[0]=3600*pre[1]+60*pre[2]+pre[3];
        later[0]=3600*later[1]+60*later[2]+later[3];
        int minus=later[0]-pre[0];
        int minute=minus/60;  minus-=minute*60;
        if(minute==0&&minus==0) System.out.print("0s");
        else if(minute==0&&minus!=0) System.out.print(minus+"s");
        else if(minute!=0&&minus==0) System.out.print(minute+"m");
        else System.out.print(minute+"m"+minus+"s");
        }
    }
