public class A1Q4 {
    public static void main(String[] args){
        int price = 0, all = 0, time = 0, level = 0;
        for (String str : args) {
            time++;
            price = Integer.parseInt(str);

            if (price >= 8000 && level < 3)
                level = 3;
            else if (price >= 3000 && level < 2)
                level = 2;
            else if (price >= 1000 && level < 1)
                level = 1;

            all += price;

            if (all >= 5000 && time >= 10 && level < 3)
                level = 3;
            else if (all >= 2000 && time >= 5 && level < 2)
                level = 2;
            else if (all >= 800 && time >= 2 && level < 1)
                level = 1;

        }
        System.out.print(level == 3 ? "Diamond":level == 2 ? "Gold": level == 1 ? "Silver":"");
    }
}
