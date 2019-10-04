import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n1,n2,n3,n4,n5,n6,n7,n8;
n1=s.nextInt();
n2=s.nextInt();
n3=s.nextInt();
n4=s.nextInt();
n5=s.nextInt();
n6=s.nextInt();
n7=(n4-n1)*60+n5-n2;
n8=n6-n3;
if(n8<0){
    n7--;
    n8+=60;
}
if(n7>=0&n7<=0)
    System.out.printf("%ds",n8);
else if(n8>=0&n8<=0)
    System.out.printf("%dm",n7);
else System.out.printf("%dm%ds",n7,n8);
    }
}
