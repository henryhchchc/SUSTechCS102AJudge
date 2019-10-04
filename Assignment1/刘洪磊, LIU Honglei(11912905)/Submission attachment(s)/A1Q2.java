import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        int h1, h2, m1, m2, s1, s2;
        Scanner input = new Scanner(System.in);
        h1 = input.nextInt();
        m1 = input.nextInt();
        s1 = input.nextInt();
        h2 = input.nextInt();
        m2 = input.nextInt();
        s2 = input.nextInt();
    int number1=h2-h1;
    int number2=number1*60;
    int number3=m2-m1;
    int number4=number2+number3;
    int number5=s2-s1;
    if (number4==0)
    { System.out.println(number5+"s");}
   else if (number5==0)
    {System.out.println(number4+"m");}

    else if (number5<0&&(number4-1)==0)
    {System.out.println((60+number5)+"s");}
    else if (number5<0&&(number4-1)!=0)
    {System.out.println((number4-1)+"m"+(60+number5)+"s");}


    else
    {System.out.println(number4+"m"+number5+"s");}



    }
}
