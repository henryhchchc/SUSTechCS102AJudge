
public class A1Q1 {
    public static void main(String[] args) {
        String name;
        name = args[0];
        String num;
        num = args[1];
        String str = String.valueOf(num);
        if (str.length() == 8) {
            int a = Integer.valueOf(num).intValue();
            if (a>=11500000&&a<=11999999)
            System.out.println(name + "，welcome tinto SUSTECH Hot Pot!");
        } else {
            System.out.println("wrong id");
        }
    }
}