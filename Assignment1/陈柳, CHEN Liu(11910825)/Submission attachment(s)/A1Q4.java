public class A1Q4 {
    public static void main(String[]args){
        System.out.println("enter the consumptions");

        int B=0,C=0,D=0,G=0,S=0,i=1;
        int length=args.length;

        while(i<length){
            int A=Integer.parseInt(args[i]);//A is single
            B=B+A;//B is sum
            C++;//C is counter
            if(A>=8000)
                D++;
            else if(A<8000&&A>=3000)
                G++;
            else if(A<3000&&A>=1000)
                S++;
            i++;
        }
        if(C>=10&&B>=5000||D>0)
            System.out.println("Diamond");
        else if(C>=5&&B>=2000||D==0&&G>0)
            System.out.println("Gold");
        else if(C>=2&&B>=800||D==0&&G==0&&S>0)
            System.out.println("Silver");
    }
}
