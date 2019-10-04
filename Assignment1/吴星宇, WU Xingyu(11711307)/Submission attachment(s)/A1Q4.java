//package A1;
public class A1Q4 {
    public static void main(String[] args){
        int len = args.length;
        int a = Integer.parseInt(args[0]);
        int notDiamond = 1;
        int notGold = 2;
        int notSilver = 3;
        int sum = 0;
        for(int i = 0 ; i < args.length;i++) {
            a = Integer.parseInt(args[i]);
            sum = sum + a;
            if(a >= 8000 ) {
                notDiamond = 4;
            }
            else if(a >= 3000){
                notGold = 5;
            }
            else if(a >=1000){
                notSilver = 6;
            }
        }
        if(sum >= 5000 && len >= 10){
            notDiamond = 4;
        }
        else if(sum >= 2000 && len >= 5){
            notGold = 5;
        }
        else if(sum >= 800 && len >= 2) {
            notSilver = 6;
        }
        if(notDiamond == 4){
            System.out.print("Diamond");
        }
        else if(notGold == 5){
            System.out.print("Gold");
        }
        else if(notSilver == 6){
            System.out.print("Silver");
        }
    }
}
