public class A1Q5 {
    public static void main(String[] args){
   double a;int b,c,i;
   i=0;
   a=2;

        int length = args.length;
    while (length!=i){
        a=Double.parseDouble(args[i]);
b=(int)(Math.floor(a));
c=b%10;
if (c==2){
        a=a+4;
              System.out.printf(a+" ");}
   if (c==4){
        a=a+5;
              System.out.printf(a+" ");}
    i=i+1;}
}}
