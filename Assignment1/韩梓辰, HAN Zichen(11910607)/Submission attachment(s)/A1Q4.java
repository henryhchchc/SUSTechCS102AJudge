public class A1Q4
{
    public static void main ( String[] args )
    {
        int a,b,c,i;
        b=0;c=0;i=0;
        while(args.length!=i){
            a=Integer.parseInt(args[i]);
            i=i+1;
            b=b+1;
            c=c+a;
            if(a>=1000){
                if(a>=3000){
                    if(a>=8000){System.out.printf("Diamond");break;}
                    else{System.out.printf("Gold");break;
                    }}
                else{
                    System.out.printf("Silver");
                break;}
            }}
        if(b>=10&&c>=5000){
            System.out.printf("Diamond");
        }
        else if(b>=5&&c>=2000){System.out.printf("Gold");
        }
        else if(b>=2&&c>=800){System.out.printf("Silver");}
    }

}