import java.util.Scanner;
public class A1Q5 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=args.length;int i;i=0;double a,x;
        while(i<=(n-1)){
            a=Double.parseDouble(args[i]);
            i++;
            x=(Math.floor(a)-10*Math.floor(a/10));
            if(x==2)
            {a=a+4;
                        System.out.printf("%s ",a);}
            else if(x==4)
             {a=a+5;
                        System.out.printf("%s ",a);}


    }
    }
}
