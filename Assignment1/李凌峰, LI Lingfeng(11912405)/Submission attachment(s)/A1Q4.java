

public class A1Q4 {

    public static void main(String[] args) {
        int length = args.length;
        int amount = 0;
        int times = 0;
        int total = 0;
        while(times < length){
            total += amount;
            amount = Integer.parseInt(args[times]);
            times++;
        }
        if(times >= 10&&total >= 5000 ||total >= 8000){
            System.out.print("Diamond");
        }else if(times >= 5&&total >= 2000||total >= 3000){
            System.out.print("Gold");
        }else if(times >= 2&&total >= 800||total >= 1000){
            System.out.print("Silver");
        }
    }
}
