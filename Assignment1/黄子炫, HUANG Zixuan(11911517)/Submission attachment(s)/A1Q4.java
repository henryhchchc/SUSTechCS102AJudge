public class A1Q4 {
    public static void main(String[] args){
        int a = 0,sum = 0,num = 0,i=0;
        String vip = " ";
        while (a <= args.length -1) {
            num = Integer.parseInt(args[a]);
            if (num >= 8000) {
                vip = "Diamond";
                i = 3;
            } else if (num >= 3000 && i<2) {
                vip = "Gold";
                i = 2;
            } else if (num >= 1000 && i<1) {
                vip = "Silver";
                i = 1;
            }
            sum += num;
            a++;
        }
        if (a >= 10 && sum >= 5000){
            vip = "Diamond";
        }else if (a >= 5 && sum >= 2000 && i<2){
            vip = "Gold";
        }else if (a >= 2 && sum >= 800 && i < 1){
            vip = "Silver";
        }
        System.out.print(vip);
    }
}
