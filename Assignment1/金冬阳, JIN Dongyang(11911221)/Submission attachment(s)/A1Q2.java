import java.util.Scanner;

//A2Q2 11911221
public class A1Q2 {
    public  static  void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b =scan.nextInt();
        int c =scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();
        int g = (d-a)*60;
        int h = e-b;
        int i = f-c;
        int j=g+h;
        if (j == 0 && i>0)
            System.out.printf("%ss",i);
        else if (i == 0 && j>0)
            System.out.printf("%sm",j);
        if (i <0) {
        int k = j-1;
        int l = 60+i;
            System.out.printf("%sm %ss",k,l);
        }
        else if (j == 0){
            if (i ==0);
            System.out.printf("%ss",i);

        }
        else if (i>0&&j>0)
            System.out.printf("%sm%ss",j,i);


    }
}

