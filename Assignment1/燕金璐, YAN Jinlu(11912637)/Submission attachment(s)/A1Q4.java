public class A1Q4 {
    public static void main(String[] args){
        int times = 1;
        int sum = 0;
        int single = Integer.parseInt(args[0]);

        for (int i = 1;i < 11; i++);                 //N:i++的意思是先进行表达式运算，再进行自增运算。
               sum += single;                        //N: ++i的意思是先进行自增或者自减运算，再进行表达式运算
               if (sum >= 5000 && times >= 10 || single >= 8000){         //N:&&当第一个条件不成之后，后面的条件都不执行了， 而&则还是继续执行，直到整个条件语句执行完为止。
                   System.out.printf("Diamond");
               }else if (sum>= 2000 && times >= 5 || single >= 3000){
                   System.out.printf("Gold");
               }else if (sum >= 800 && times >= 2 || single >=1000){
                   System.out.printf("Silver");
               }
               }
}
