
public class A1Q5 {
    public static void main(String[] args){
   int length=args.length,i=0;
double e=0,f=0;
        while (i<length) {
            String a=args[i];i=i+1;
int d=Integer.parseInt(a);


            if ((d-2)%10==0)
            { e=d+4;
            System.out.print(e+" ");}
            else if((d-4)%10==0)
            {   f=d+5;
            System.out.print(f+" ");}

        }
    }

}
