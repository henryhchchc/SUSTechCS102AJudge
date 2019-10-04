import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        double wu,shu,jia,zongjia;
        jia=0;
        zongjia=0;
        Scanner in=new Scanner(System.in);
        String[] shuru;
        while(in.hasNext())
        {
            shuru=in.nextLine().split(" ");
            wu=Double.parseDouble(shuru[0]);
            shu=Double.parseDouble(shuru[1]);
            if(Math.round(shu)!=shu){
                jia=(Math.round(shu)-1)*wu+Math.round(wu*10/2)/10+1;

            }
            else {
                jia=wu*shu;
            }
            zongjia=zongjia+jia;

        }
        System.out.printf("%.1f",zongjia);
    }
}

