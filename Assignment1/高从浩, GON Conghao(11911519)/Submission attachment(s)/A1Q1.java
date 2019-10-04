public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
        int number1 = Integer.parseInt(args[1]);
        int number2 = number1/100000;
        if(number2 >=115 && number2 <=119){
            System.out.printf("%s,welcome to SUSTECH Hot Pot Restaurant!",name);
        } else{System.out.print(number1);}
    }
}
