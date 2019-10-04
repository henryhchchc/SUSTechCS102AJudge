public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
        int number = Integer.parseInt(args[1]);

        if (number/100000 >= 115 & number/100000 <= 119)
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!\n",name);
        else
            System.out.println(number);
    }
}
