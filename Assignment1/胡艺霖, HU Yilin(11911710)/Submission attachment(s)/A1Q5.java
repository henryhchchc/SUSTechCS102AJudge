public class A1Q5 {
    public static void main(String[]args){
        int i,c;
        float e,b,d;
        i=0;
        d=0;
        c=args.length;
        float []a=new float[100];
        while (i<c){
            b=a[i]=Float.parseFloat(args[i]);
            a[i]=(int)a[i];
            e=a[i]%10;
            if (e==2){
                b=b+4;
                System.out.printf("%s ",b);
            }
            else if (e==4){
                b=b+5;
                System.out.printf("%s ",b); 
            }
            else if(e!=2)
                b=d;

            i=i+1;
        }
   }
}
