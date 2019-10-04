import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int a,b,c,d,e,f,g,h,i,j,k,l;
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        d=input.nextInt();
        e=input.nextInt();
        f=input.nextInt();
      g=(d-a)*3600;
      h=(e-b)*60;
      i=(f-c);
      j=g+h+i;
      k=j/60;
      l=j-k*60;
      if (k==0)
          System .out.printf("%s\fs",l);
else if (l==0)
    System.out.printf("%s\fm",k);

      else System.out.printf(" %s\fm,%s\fs",k,l);

}}
