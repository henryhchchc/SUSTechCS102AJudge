
public class A1Q4 {
    public static void main(String[] args) {
        int times = 0;
        int cumulative = 0;
        int single1 = 0;
        for (times = 0; times < args.length; ++times) {
            int single = Integer.parseInt(args[times]);
            cumulative = cumulative + single;
            if (single >= single1) {
                single1 = single;
            } else single1 = single1;
        }
            if ((times >= 10 && cumulative >= 5000) || single1 >= 8000) {
                System.out.printf("Diamond");
            } else if ((times >= 5 && cumulative >= 2000) || single1 >= 3000) {
                System.out.printf("Gold");
            } else if ((times >= 2 && cumulative >= 800) || single1 >= 1000)
                System.out.printf("Silver");




    }


}