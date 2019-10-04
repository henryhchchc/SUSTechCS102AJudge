import java.io.EOFException;
import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        float[][] a=new float[3][1000];int num=0;double sum=0,tot2,tot1;
        while (input.hasNext()){
            num++;
            a[1][num]=input.nextFloat();
            a[2][num]=input.nextFloat();
            tot2=a[1][num]*a[2][num];
            tot1=Math.rint(10*tot2);
            sum+=(float)tot1/10;
            if((a[2][num]*10)%2!=0)sum++;
        }
        for(int i=1;i<=num;i++)
            System.out.println(a[1][i]+" "+a[2][i]);
        System.out.printf("%.1f\n",sum);
    }
}
