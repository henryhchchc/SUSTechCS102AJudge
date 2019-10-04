public class A1Q4 {
    public static void main(String[] args){
        int max = 0,n = 0,sum = 0;
        for (int i = 0;i < args.length;i++){
            int  money = Integer.parseInt(args[i]);
            if(money > max){
            max = money;
            }
            sum = money + sum;
            n++;
        }
        if (max >= 8000) {
            System.out.print("Diamond");
        }else if (n >= 10 && sum >= 5000) {
            System.out.print("Diamond");
        }else if (max >= 3000) {
            System.out.print("Gold");
        }else if (n >= 5 && sum >= 2000) {
            System.out.print("Gold");
        }else if (max >= 1000) {
            System.out.print("Silver");
        } else if (n >= 2 && sum >= 1000){
            System.out.print("Silver");
        }



    }

}
