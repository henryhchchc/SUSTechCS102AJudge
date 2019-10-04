public class A1Q4 {
    public static void main(String[] args) {
        int sum = 0;
        //标记会员等级，1是白银，2是黄金，3是钻石
        int flag = 0;
        for (String s : args) {
            int value = Integer.parseInt(s);
            sum += value;
            //遍历的时候把单次消费的等级先标记一下
            if (value >= 1000 && value < 3000 && flag <= 1) {
                flag = 1;
            } else if (value >= 3000 && value < 8000 && flag <= 2) {
                flag = 2;
            } else if (value >= 8000 & flag <= 3) {
                flag = 3;
            }
        }
        if (args.length >= 2 && sum >= 800 && flag <= 1) {
            flag = 1;
        }
        if (args.length >= 5 && sum >= 2000 && flag <= 2) {
            flag = 2;
        }
        if (args.length >= 10 && sum >= 5000 && flag <= 3) {
            flag = 3;
        }
        if (flag == 1) {
            System.out.println("Silver");
        }
        if (flag == 2) {
            System.out.println("Gold");
        }
        if (flag == 3) {
            System.out.println("Diamond");
        }
    }

}
