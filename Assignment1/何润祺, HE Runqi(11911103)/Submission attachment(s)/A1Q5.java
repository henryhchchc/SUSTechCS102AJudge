public class A1Q5 {
    public static void main(String[] args) {
    double num=0;
    double num1=0;

        for(int i=0;i<args.length;i++)
        {   num=Double.parseDouble(args[i]);
           num1=Math.floor(num);

        if((num1%10)==2)
        {num=num+4;
            System.out.print(num+" ");}
            else if((num1%10)==4)
        {num=num+5;
            System.out.print(num+" ");}
       else if(num<10&&num1==2)
        {num=num+4;
        System.out.print(num+" ");}
       else if(num<10&&num1==4)
        {num=num+5;
        System.out.print(num+" ");}}
        //System.out.println()





    }
}