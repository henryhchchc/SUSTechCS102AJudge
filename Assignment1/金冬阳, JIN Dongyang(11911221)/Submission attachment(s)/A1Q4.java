public class A1Q4 {
    public static void main(String[] args) {
        int total = 0;
        int number = 0;
        int max=0;
        int a = args.length;
       for(int i=0;i<args.length;i++) {
            int money = Integer.parseInt(args[i]);
            total = total + money;
            number = number + 1;
            if (money > max)
                max = money;
        }
        if (max >= 5000){
            System.out.println("Diamond");}
        else if((total >= 8000)&&(number >= 10)) {
            System.out.println("Diamond");}
        else if (max >= 2000){
            System.out.println("Gold");}
        else if ((total >= 3000)&&(number >= 5)) {
            System.out.println("Gold");}
        else if (max >= 1000){
            System.out.println("Silver");}
        else if ((total >= 800)&& (number >= 2)) {
            System.out.println("Silver");
        }
    }
}