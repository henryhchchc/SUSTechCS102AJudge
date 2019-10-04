
public class A1Q5 {
    public static void main(String[]args){
        int a=0;int length=args.length;
        while(a<length){
           double i=Double.parseDouble(args[a]);
           double j= i%1;
           double h=i-j;
           double k=h%10;;
           double f=h-k;
           a++;
           if (k==2){
               k=6;
                   System.out.printf("%s ",f+j+k);
           }
           else
               if (k==4){
                   k=9;
                   System.out.printf("%s ",f+j+k);
               }

        }
}}

