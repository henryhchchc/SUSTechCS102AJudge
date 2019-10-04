public class A1Q5{
    public static void main(String[]args){
        float a = 0;
        double c = 0;
        double b = 0,d=0 ;
        int length=args.length,i=0;
        System.out.println("please enter the initial prices of the dishes \n");
        while(i<length){
            a=Float.parseFloat(args[i]);

            c= Math.floor(a);//c is the int of a
            d = Math.floor(c/10);//b is the number of unit
            b = (c-d*10);
            if(b==2)
                System.out.println(a+4);
            else if(b==4)
                System.out.println(a+5);
            else
                a=a;
            i++;
        }
    }
}
