    public class A1Q1 {
        public static void main(String[] args){
            String name=args[0];
            String value=args[1];
            int number=Integer.valueOf(value);
            if(12000000>number&&number>=11500000){
                System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
            }else{
                System.out.print(number);}
        }
    }

