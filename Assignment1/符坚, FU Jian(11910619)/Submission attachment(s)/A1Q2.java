import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int[][] Time=new int[4][4];
        for(int i=1;i<=2;i++) {
            for (int j = 1; j <= 3; j++)
                Time[i][j] = input.nextInt();
        }
        Time[3][3]=Time[2][3]-Time[1][3];
        if(Time[3][3]<0){
            Time[2][2]--;
            Time[3][3]+=60;
        }
        Time[3][2]=60*(Time[2][1]-Time[1][1])+Time[2][2]-Time[1][2];
        boolean b=true;
        if(Time[3][2]==0)b=false;
         else System.out.print(Time[3][2]+"m");
         if ((Time[3][3]!=0)||(!b))
                System.out.println(Time[3][3]+"S");
           else System.out.println();
    }
}