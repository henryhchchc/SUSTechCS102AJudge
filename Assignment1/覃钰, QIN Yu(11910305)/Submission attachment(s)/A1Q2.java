import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        int e=scanner.nextInt();
        int f=scanner.nextInt();
if(f>c&&((d-a)*60+e-b)!=0){
    System.out.println((d-a)*60+e-b+"m"+(f-c)+"s");
}
        if(f>c&&((d-a)*60+e-b)==0){
            System.out.println((f-c)+"s");
        }
       if (f<c&&((d-a)*60+e-b-1)!=0){
            System.out.println(((d-a)*60+e-b-1)+"m"+(f-c+60)+"s");
        }
        if (f<c&&((d-a)*60+e-b-1)==0){
            System.out.println((f-c+60)+"s");
        }
       if (f==c&&b!=e){
           System.out.println((d-a)*60+e-b+"m");
       }
       if (f==c&&b==e){
           System.out.println("0s");
       }
    }
}
