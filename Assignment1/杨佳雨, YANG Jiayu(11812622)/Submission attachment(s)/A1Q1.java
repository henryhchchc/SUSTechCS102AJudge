public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
        int number = Integer.parseInt(args[1]);
        if (number > 11500000){
                if(number < 11900000)
                    System.out.printf("%s,welcome to SUSTECH Hot Pot Restaurant!\n",name);
                else System.out.println(number);
            }
        else System.out.println(number);
    }
}