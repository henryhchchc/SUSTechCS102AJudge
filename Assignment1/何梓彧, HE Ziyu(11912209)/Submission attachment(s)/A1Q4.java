

public class A1Q4 {

    public static void main(String[] args){
        int i=0;

        int length = args.length;
 while(i<length){String m=args[i];
    int a=Integer.parseInt(m), b=0;
     i=i+1; b=b+a;
      if (a>=8000||length>=10&&b>=5000)
      System .out.printf("diamond");
     else if(a>=3000||length>=5&&b>=2000)
         System.out.printf("gold");
     else if(a>=1000||length>=2&&b>=800)
System.out.printf("silver");
}}}
