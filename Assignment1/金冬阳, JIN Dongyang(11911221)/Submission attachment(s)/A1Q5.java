public class A1Q5 {
    public static void main(String[] args) {
        int i;
        for(i=0;i<args.length;i++) {
            double total=0;
            double money = Double.parseDouble(args[i]);
            int money1 = (int) money;
            if (money1 % 10 == 2){
                total=money + 4;
            }
            else if (money1 % 10 == 4){
                total=money + 5;}
            if (total != 0)
                System.out.printf("%s ",total);
        }
    }
}
