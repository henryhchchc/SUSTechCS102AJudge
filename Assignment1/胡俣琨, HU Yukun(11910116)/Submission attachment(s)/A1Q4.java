public class A1Q4 {
    public static void main(String[] args) {
        int total = 0;
        int number = args.length;

        for (String ss : args) {
            total += Integer.parseInt(ss);
        }

        for (String ss : args) {
            if  (Integer.parseInt(ss) >= 8000 || number >= 10 && total >= 5000){
                System.out.print("Diamond");
                break;}

            else if (Integer.parseInt(ss) >= 3000 || number >= 5 && total >= 3000){
                System.out.print("Gold");
                break;}

            else if (Integer.parseInt(ss) >= 1000 || number >= 2 && total >= 800){
                System.out.print("Silver");
                break;}
        }

    }
}




