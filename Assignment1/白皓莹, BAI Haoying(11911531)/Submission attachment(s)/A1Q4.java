

public class A1Q4 {
    public static void main(String[] args) {

        int a = 0;
        int price = 0;
        int all = 0;
        int level = 0;
        for (String str : args) {
            all++;
            price = Integer.parseInt(str);

            if (price >= 8000 && level < 3) {
                level = 3;
            } else if (price >= 3000 && level < 2) {
                level = 2;
            } else if (price >= 1000 && level < 1) {
                level = 1;
            }
            a += price;


        }
        if ((all >= 10) && (a >= 5000) && level < 3) {
            level = 3;
        } else if ((all >= 5) && (a >= 2000) && level < 2) {
            level = 2;
        } else if ((all >= 2) && (a >= 800) && level < 1) {
            level = 1;
        }
        System.out.print(level == 3 ? "Diamond" : level == 2 ? "Gold" : level == 1 ? "Silver" : "");

    }
}
