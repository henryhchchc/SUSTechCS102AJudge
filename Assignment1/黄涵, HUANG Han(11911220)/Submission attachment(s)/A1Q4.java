public class A1Q4 {

    public static void main(String[] args) {
	// write your code here
        int count = args.length;
        int sum = 0,max=0;
        for(String arg:args) {
            int num = Integer.parseInt(arg);
            max = Math.max(max,num);
            sum += num;
        }

        if (count >= 10) {
            if (sum >= 5000)
                System.out.print("Diamond");

            }

        else if (max >= 8000)
            System.out.print("Diamond");


        else if (count >= 5) {
            if (sum >= 2000)
                System.out.print("Gold");
        }

        else if (max >= 2000)
            System.out.print("Gold");


        else if (count >= 2) {
            if (sum >= 800)
                System.out.print("Silver");
        }

        else if (max >= 1000)
            System.out.print("Silver");
    }
}
