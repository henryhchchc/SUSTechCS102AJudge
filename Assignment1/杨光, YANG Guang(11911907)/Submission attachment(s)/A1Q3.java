import java.util.Scanner;
public class A1Q3 {

    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
double total,a,b,c;total=0;a=0;b=0;c=0;
while(in.hasNext()){
    double price = in.nextDouble();
    double size = in.nextDouble();
   if(size!=1&&size!=2){b=size%1;c=(int)size/1; a=Math.round(price*b+1)+c*price;}
   else{ a=price*size;}
    total=total+a;
}System.out.printf("%.1f",total);

    }
}
