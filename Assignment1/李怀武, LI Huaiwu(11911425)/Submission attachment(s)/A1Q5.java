public class A1Q5 {
    public static void main(String[] args){
       int i;
       int length=args.length;
        double numb2 ;
        double numb1 ;
        double ten1;
        int ten2;
        double decimal;
        int single;
        for(i = 0; i < args.length ; ++i) {
           numb1 = Double.parseDouble(args[i]);
            ten1= numb1/10;
            ten2=(int)ten1;
            decimal=numb1-10*ten2;
            single=(int)decimal;
           if(single==2)
           {numb2=numb1+4;
           System.out.print(numb2+" " );}

           if(single==4)
           {numb2=numb1+5;
           System.out.print(numb2+" " );}
       }
    }
}
